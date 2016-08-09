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
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSAffineTransform;
import mac.foundation.NSCharacterSet;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFont extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFont(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("advancementForGlyph:")
	@ByValue
	public native CGSize advancementForGlyph(int ag);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFont alloc();

	@Generated
	@Selector("ascender")
	public native double ascender();

	@Generated
	@Selector("boldSystemFontOfSize:")
	public static native NSFont boldSystemFontOfSize(double fontSize);

	@Generated
	@Selector("boundingRectForFont")
	@ByValue
	public native CGRect boundingRectForFont();

	@Generated
	@Selector("boundingRectForGlyph:")
	@ByValue
	public native CGRect boundingRectForGlyph(int aGlyph);

	@Generated
	@Selector("capHeight")
	public native double capHeight();

	@Generated
	@Selector("controlContentFontOfSize:")
	public static native NSFont controlContentFontOfSize(double fontSize);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("coveredCharacterSet")
	public native NSCharacterSet coveredCharacterSet();

	@Generated
	@Selector("descender")
	public native double descender();

	@Generated
	@Selector("displayName")
	public native String displayName();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("familyName")
	public native String familyName();

	@Generated
	@Selector("fontDescriptor")
	public native NSFontDescriptor fontDescriptor();

	@Generated
	@Selector("fontName")
	public native String fontName();

	@Generated
	@Selector("fontWithDescriptor:size:")
	public static native NSFont fontWithDescriptorSize(
			NSFontDescriptor fontDescriptor, double fontSize);

	@Generated
	@Selector("fontWithDescriptor:textTransform:")
	public static native NSFont fontWithDescriptorTextTransform(
			NSFontDescriptor fontDescriptor, NSAffineTransform textTransform);

	@Generated
	@Selector("fontWithName:matrix:")
	public static native NSFont fontWithNameMatrix(String fontName,
			ConstDoublePtr fontMatrix);

	@Generated
	@Selector("fontWithName:size:")
	public static native NSFont fontWithNameSize(String fontName,
			double fontSize);

	@Generated
	@Selector("getAdvancements:forGlyphs:count:")
	public native void getAdvancementsForGlyphsCount(
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize advancements,
			ConstIntPtr glyphs, long glyphCount);

	@Generated
	@Selector("getAdvancements:forPackedGlyphs:length:")
	public native void getAdvancementsForPackedGlyphsLength(
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize advancements,
			ConstVoidPtr packedGlyphs, long length);

	@Generated
	@Selector("getBoundingRects:forGlyphs:count:")
	public native void getBoundingRectsForGlyphsCount(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect bounds,
			ConstIntPtr glyphs, long glyphCount);

	@Generated
	@Selector("glyphWithName:")
	public native int glyphWithName(String aName);

	@Generated
	@Selector("init")
	public native NSFont init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isFixedPitch")
	public native boolean isFixedPitch();

	@Generated
	@Selector("isVertical")
	public native boolean isVertical();

	@Generated
	@Selector("italicAngle")
	public native double italicAngle();

	@Generated
	@Selector("labelFontOfSize:")
	public static native NSFont labelFontOfSize(double fontSize);

	@Generated
	@Selector("labelFontSize")
	public static native double labelFontSize();

	@Generated
	@Selector("leading")
	public native double leading();

	@Generated
	@Selector("matrix")
	public native ConstDoublePtr matrix();

	@Generated
	@Selector("maximumAdvancement")
	@ByValue
	public native CGSize maximumAdvancement();

	@Generated
	@Selector("menuBarFontOfSize:")
	public static native NSFont menuBarFontOfSize(double fontSize);

	@Generated
	@Selector("menuFontOfSize:")
	public static native NSFont menuFontOfSize(double fontSize);

	@Generated
	@Selector("messageFontOfSize:")
	public static native NSFont messageFontOfSize(double fontSize);

	@Generated
	@Selector("mostCompatibleStringEncoding")
	public native long mostCompatibleStringEncoding();

	@Generated
	@Selector("numberOfGlyphs")
	public native long numberOfGlyphs();

	@Generated
	@Selector("paletteFontOfSize:")
	public static native NSFont paletteFontOfSize(double fontSize);

	@Generated
	@Selector("pointSize")
	public native double pointSize();

	@Generated
	@Selector("printerFont")
	public native NSFont printerFont();

	@Generated
	@Selector("renderingMode")
	public native long renderingMode();

	@Generated
	@Selector("screenFont")
	public native NSFont screenFont();

	@Generated
	@Selector("screenFontWithRenderingMode:")
	public native NSFont screenFontWithRenderingMode(long renderingMode);

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("setInContext:")
	public native void setInContext(NSGraphicsContext graphicsContext);

	@Generated
	@Selector("setUserFixedPitchFont:")
	public static native void setUserFixedPitchFont(NSFont aFont);

	@Generated
	@Selector("setUserFont:")
	public static native void setUserFont(NSFont aFont);

	@Generated
	@Selector("smallSystemFontSize")
	public static native double smallSystemFontSize();

	@Generated
	@Selector("systemFontOfSize:")
	public static native NSFont systemFontOfSize(double fontSize);

	@Generated
	@Selector("systemFontSize")
	public static native double systemFontSize();

	@Generated
	@Selector("systemFontSizeForControlSize:")
	public static native double systemFontSizeForControlSize(long controlSize);

	@Generated
	@Selector("textTransform")
	public native NSAffineTransform textTransform();

	@Generated
	@Selector("titleBarFontOfSize:")
	public static native NSFont titleBarFontOfSize(double fontSize);

	@Generated
	@Selector("toolTipsFontOfSize:")
	public static native NSFont toolTipsFontOfSize(double fontSize);

	@Generated
	@Selector("underlinePosition")
	public native double underlinePosition();

	@Generated
	@Selector("underlineThickness")
	public native double underlineThickness();

	@Generated
	@Selector("userFixedPitchFontOfSize:")
	public static native NSFont userFixedPitchFontOfSize(double fontSize);

	@Generated
	@Selector("userFontOfSize:")
	public static native NSFont userFontOfSize(double fontSize);

	@Generated
	@Selector("verticalFont")
	public native NSFont verticalFont();

	@Generated
	@Selector("xHeight")
	public native double xHeight();
}
