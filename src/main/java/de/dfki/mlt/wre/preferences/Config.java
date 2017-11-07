/**
 *
 */
package de.dfki.mlt.wre.preferences;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author Aydan Rende, DFKI
 *
 */
public final class Config {

	public static final String DIRECTORY_PATH = "directory.path";
	public static final String CLUSTER_NAME = "cluster.name";
	public static final String BULK_FLUSH_MAX_ACTIONS = "bulk.flush.max.actions";
	public static final String HOST = "host";
	public static final String PORT = "port";
	public static final String INDEX_NAME = "index.name";
	public static final String ENTITY_TYPE_NAME = "entity.type.name";
	public static final String RELATION_TYPE_NAME = "relation.type.name";
	public static final String WIKIPEDIA_EXTENSION = "wikipedia.extension";

	private static PropertiesConfiguration config;

	private Config() {

	}

	private static void loadProps() {
		try {
			config = new PropertiesConfiguration("config.properties");
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static PropertiesConfiguration getInstance() {

		if (config == null) {
			loadProps();
		}
		return config;
	}

}
