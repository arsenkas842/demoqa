package org.demoqa.config.converters;

import org.aeonbits.owner.Converter;
import org.demoqa.enums.BrowserType;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME",BrowserType.Chrome);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.Chrome);
    }
}
