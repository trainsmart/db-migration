package com.carbonfive.db.migration.maven;

import org.apache.maven.plugin.MojoExecutionException;

/**
 * Execute seed migration
 * <p/>
 *
 * @goal seed
 */
public class SeedMojo extends AbstractMigrationMojo {
    public void executeMojo() throws MojoExecutionException {
        getLog().info("Seeding " + getUrl() + ".");

        try
        {
            createMigrationManager().seed();
        }
        catch (Exception e)
        {
            throw new MojoExecutionException("Failed to seed " + getUrl(), e);
        }

    }
}
