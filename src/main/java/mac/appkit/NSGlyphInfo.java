/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSGlyphInfo extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSGlyphInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSGlyphInfo alloc();

	@Generated
	@Selector("characterCollection")
	public native long characterCollection();

	@Generated
	@Selector("characterIdentifier")
	public native long characterIdentifier();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("glyphInfoWithCharacterIdentifier:collection:baseString:")
	public static native NSGlyphInfo glyphInfoWithCharacterIdentifierCollectionBaseString(
			long cid, long characterCollection, String theString);

	@Generated
	@Selector("glyphInfoWithGlyph:forFont:baseString:")
	public static native NSGlyphInfo glyphInfoWithGlyphForFontBaseString(
			int glyph, NSFont font, String theString);

	@Generated
	@Selector("glyphInfoWithGlyphName:forFont:baseString:")
	public static native NSGlyphInfo glyphInfoWithGlyphNameForFontBaseString(
			String glyphName, NSFont font, String theString);

	@Generated
	@Selector("glyphName")
	public native String glyphName();

	@Generated
	@Selector("init")
	public native NSGlyphInfo init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);
}
