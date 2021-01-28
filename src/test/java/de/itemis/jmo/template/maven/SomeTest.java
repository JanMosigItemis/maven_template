package de.itemis.jmo.template.maven;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitPlatform.class)
public class SomeTest {

    @Test
	public void testSomething() {
		assertThat(true).isTrue();
	}
}
