package org.fabianlee.mavendeploy;

import org.junit.Test;

public class TestMavenDeployUtils {
	
	@Test
	public void test() throws Exception {
		System.err.println(MavenDeployUtils.getAppAndBuildVersion() + "] is this processor 64bit? " + MavenDeployUtils.is64BitProcessor());
	}

}
