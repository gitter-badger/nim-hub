package com.kivimango.nimhub.util;

import com.kivimango.nimhub.data.AuthorDto;
import com.kivimango.nimhub.data.PackageDto;
import com.kivimango.nimhub.data.TagDto;

import java.util.HashSet;
import java.util.Set;

public class TestData {
    public static final String packageName = "test-lib";
    public static final String description = "Test description";
    public static final String tag = "test";
    public static final String license = "MIT";
    public static final String web = "https://github.com/kivimango/nim-hub";
    public static final String version = "1.0-STABLE";

    public static Set<TagDto> getTestTagDtos() {
        Set<TagDto> tagDto = new HashSet<>();
        tagDto.add(TagDto.of(tag));
        return tagDto;
    }

    public static PackageDto dto = PackageDto.of(1L, AuthorDto.of(1L, "testUser", "test@testemail.com"), packageName, description, license, web, version, getTestTagDtos(), false);
}
