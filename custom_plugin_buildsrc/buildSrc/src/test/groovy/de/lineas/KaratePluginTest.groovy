package de.lineas

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.testng.Assert.assertEquals
import static org.testng.Assert.assertNotNull

/**
 */
class KaratePluginTest {

    @Test
    public void startPlugin() {

        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'karate'

        assertNotNull(project.tasks.karate)
    }

    @Test
    public void testKarateProperty() {

        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'karate'

        project.karate.smartQuote = 'Unicorn'

        assertEquals('Unicorn', project.karate.smartQuote)
    }
}
