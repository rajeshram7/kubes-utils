package com.denniskubes.webasset;

import java.io.File;
import java.util.Map;

public interface WebAssetFilter {

  public File filterAsset(File input, Map<String, String> fieldMap);

}
