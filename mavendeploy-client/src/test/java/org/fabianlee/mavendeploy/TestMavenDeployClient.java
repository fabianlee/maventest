package org.fabianlee.mavendeploy;

import org.junit.Test;

public class TestMavenDeployClient {

	@Test
	public void test() throws Exception {
		System.err.println("CLIENT making call to dependency: " + MavenDeployUtils.getAppAndBuildVersion());
		System.err.println("CLIENT is this processor 64bit? " + MavenDeployUtils.is64BitProcessor());
	}

}
