package org.nge;

import io.atlasmap.api.AtlasContext;
import io.atlasmap.api.AtlasContextFactory;
import io.atlasmap.api.AtlasException;
import io.atlasmap.api.AtlasSession;
import io.atlasmap.core.DefaultAtlasContextFactory;
import org.nge.model.Person;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AtlasMapExample {

    public static void main(String[] args) throws AtlasException, URISyntaxException, IOException {

        // Initialize AtlasContextFactory
        AtlasContextFactory factory = DefaultAtlasContextFactory.getInstance();

        // Load the mapping file
        URL employeeSchema = getResource("employee-mapping.json");
        AtlasContext context = factory.createContext(employeeSchema.toURI());

        // Create a session
        AtlasSession session = context.createSession();

        // Set source document
        URL employeeData = getResource(args[0]);
        String xmlInput = new String(Files.readAllBytes(Paths.get(employeeData.toURI())));
        session.setSourceDocument("XMLInstanceSource", xmlInput);

        // Perform the mapping
        context.process(session);

        // Get the target document
        Object javaOutput = session.getTargetDocument("org.nge.model.Person");

        // Cast the output to your target class
        Person person = (Person) javaOutput;

        // Use the mapped object
        System.out.println("Mapped Person: \n" + person.toString());
    }

    public static URL getResource(String name) {
        return Thread.currentThread().getContextClassLoader().getResource(name);
    }
}