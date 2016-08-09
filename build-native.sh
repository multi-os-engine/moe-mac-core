#!/bin/bash

realpath () {
  [[ $1 = /* ]] && echo "$1" || echo "$PWD/${1#./}"
}
WORKSPACE="$(dirname "$(realpath "$0")")"

cd "$WORKSPACE";

SOURCES="ApplicationServices CFNetwork CoreFoundation CoreGraphics CoreServices Foundation Globals"
INPUT=""

for src in $SOURCES
do
	INPUT="$INPUT src/main/native/inline/$src.m"
done

mkdir -p build/native/macosx/x86_64
clang -dynamiclib -O2 -lobjc -fexceptions -fstack-protector-strong -fPIC\
	-Wno-deprecated-declarations -Wformat -Wformat-security\
	-isysroot "$(xcrun --sdk macosx --show-sdk-path)" \
	-framework CoreFoundation \
	-mmacosx-version-min=10.9 \
	-o build/native/macosx/x86_64/libmaccoreinlined.dylib $INPUT
