package it.cosenzproject.mybatiscodegen.plugin;

import java.util.logging.Logger;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import it.cosenzproject.mybatiscodegen.App;

@Mojo(name = "mybatiscodegen-maven-plugin", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class MyBatisCodegenPlugin extends AbstractMojo {

	private static final Logger LOGGER = Logger.getLogger(MyBatisCodegenPlugin.class.getSimpleName());

	@Parameter(property = "inputFile")
	private String inputFile;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		LOGGER.info("START - mybatis codegen");
		System.setProperty("inputFile", inputFile);
		App.main(null);
		LOGGER.info("END - mybatis codegen");
	}
}
