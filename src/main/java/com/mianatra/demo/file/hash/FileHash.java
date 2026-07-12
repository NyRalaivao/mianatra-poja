package com.mianatra.demo.file.hash;

import com.mianatra.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
