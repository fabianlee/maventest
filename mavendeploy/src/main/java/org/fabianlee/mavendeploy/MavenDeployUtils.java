package org.fabianlee.mavendeploy;

import java.io.InputStream;
import java.util.Properties;

public class MavenDeployUtils {
	
	public static String PROJECT_NAME = "mavendeploy";
	
	public static boolean is64BitProcessor() {
		return org.apache.commons.lang3.ArchUtils.getProcessor().is64Bit();
	}
	
	public static String getAppAndBuildVersion() throws Exception {
		// get properties propagated from Maven pom.xml
		InputStream is = MavenDeployUtils.class.getResourceAsStream("/" + PROJECT_NAME + ".properties");
		Properties props = new Properties();
		props.load(is);
		
		return props.getProperty("project.name") + ":" + props.getProperty("project.version");
	}

}
