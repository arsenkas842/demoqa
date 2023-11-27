package org.demoqa.config;

import org.aeonbits.owner.Config;
import org.demoqa.config.converters.StringToBrowserTypeConverter;
import org.demoqa.enums.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
