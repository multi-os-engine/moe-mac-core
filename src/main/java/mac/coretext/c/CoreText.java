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

package mac.coretext.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ann.ObjCBlock;
import mac.corefoundation.opaque.*;
import mac.corefoundation.struct.CFRange;
import mac.coregraphics.opaque.CGContextRef;
import mac.coregraphics.opaque.CGFontRef;
import mac.coregraphics.opaque.CGPathRef;
import mac.coregraphics.struct.CGAffineTransform;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.coretext.opaque.*;
import mac.coretext.struct.CTParagraphStyleSetting;
import mac.coretext.struct.CTRunDelegateCallbacks;

@Generated
@Library("CoreText")
@Runtime(CRuntime.class)
public final class CoreText {
	static {
		NatJ.register();
	}

	@Generated
	private CoreText() {
	}

	@Generated
	@CFunction
	public static native long CTFontDescriptorGetTypeID();

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateWithNameAndSize(
			CFStringRef name, double size);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateWithAttributes(
			CFDictionaryRef attributes);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithAttributes(
			CTFontDescriptorRef original, CFDictionaryRef attributes);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFamily(
			CTFontDescriptorRef original, CFStringRef family);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithSymbolicTraits(
			CTFontDescriptorRef original, int symTraitValue, int symTraitMask);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithVariation(
			CTFontDescriptorRef original, CFNumberRef variationIdentifier,
			double variationValue);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFeature(
			CTFontDescriptorRef original, CFNumberRef featureTypeIdentifier,
			CFNumberRef featureSelectorIdentifier);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontDescriptorCreateMatchingFontDescriptors(
			CTFontDescriptorRef descriptor, CFSetRef mandatoryAttributes);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontDescriptorCreateMatchingFontDescriptor(
			CTFontDescriptorRef descriptor, CFSetRef mandatoryAttributes);

	@Generated
	@CFunction
	public static native boolean CTFontDescriptorMatchFontDescriptorsWithProgressHandler(
			CFArrayRef descriptors,
			CFSetRef mandatoryAttributes,
			@ObjCBlock(name = "call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler") Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler progressBlock);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler {
		@Generated
		public boolean call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler(
				int arg0, VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native CFDictionaryRef CTFontDescriptorCopyAttributes(
			CTFontDescriptorRef descriptor);

	@Generated
	@CFunction
	public static native ConstVoidPtr CTFontDescriptorCopyAttribute(
			CTFontDescriptorRef descriptor, CFStringRef attribute);

	@Generated
	@CFunction
	public static native ConstVoidPtr CTFontDescriptorCopyLocalizedAttribute(
			CTFontDescriptorRef descriptor, CFStringRef attribute,
			Ptr<CFStringRef> language);

	@Generated
	@CFunction
	public static native long CTFontGetTypeID();

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateWithName(
			CFStringRef name,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateWithFontDescriptor(
			CTFontDescriptorRef descriptor,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateWithNameAndOptions(
			CFStringRef name,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			long options);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateWithFontDescriptorAndOptions(
			CTFontDescriptorRef descriptor,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			long options);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateUIFontForLanguage(int uiType,
			double size, CFStringRef language);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateCopyWithAttributes(
			CTFontRef font,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			CTFontDescriptorRef attributes);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateCopyWithSymbolicTraits(
			CTFontRef font,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			int symTraitValue, int symTraitMask);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateCopyWithFamily(
			CTFontRef font,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			CFStringRef family);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateForString(CTFontRef currentFont,
			CFStringRef string, @ByValue CFRange range);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontCopyFontDescriptor(
			CTFontRef font);

	@Generated
	@CFunction
	public static native ConstVoidPtr CTFontCopyAttribute(CTFontRef font,
			CFStringRef attribute);

	@Generated
	@CFunction
	public static native double CTFontGetSize(CTFontRef font);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CTFontGetMatrix(CTFontRef font);

	@Generated
	@CFunction
	public static native int CTFontGetSymbolicTraits(CTFontRef font);

	@Generated
	@CFunction
	public static native CFDictionaryRef CTFontCopyTraits(CTFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyPostScriptName(CTFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyFamilyName(CTFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyFullName(CTFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyDisplayName(CTFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyName(CTFontRef font,
			CFStringRef nameKey);

	@Generated
	@CFunction
	public static native CFStringRef CTFontCopyLocalizedName(CTFontRef font,
			CFStringRef nameKey, Ptr<CFStringRef> actualLanguage);

	@Generated
	@CFunction
	public static native CFCharacterSetRef CTFontCopyCharacterSet(CTFontRef font);

	@Generated
	@CFunction
	public static native int CTFontGetStringEncoding(CTFontRef font);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopySupportedLanguages(CTFontRef font);

	@Generated
	@CFunction
	public static native boolean CTFontGetGlyphsForCharacters(CTFontRef font,
			ConstCharPtr characters, ShortPtr glyphs, long count);

	@Generated
	@CFunction
	public static native double CTFontGetAscent(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetDescent(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetLeading(CTFontRef font);

	@Generated
	@CFunction
	public static native int CTFontGetUnitsPerEm(CTFontRef font);

	@Generated
	@CFunction
	public static native long CTFontGetGlyphCount(CTFontRef font);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTFontGetBoundingBox(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetUnderlinePosition(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetUnderlineThickness(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetSlantAngle(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetCapHeight(CTFontRef font);

	@Generated
	@CFunction
	public static native double CTFontGetXHeight(CTFontRef font);

	@Generated
	@CFunction
	public static native short CTFontGetGlyphWithName(CTFontRef font,
			CFStringRef glyphName);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTFontGetBoundingRectsForGlyphs(
			CTFontRef font,
			int orientation,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects,
			long count);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTFontGetOpticalBoundsForGlyphs(
			CTFontRef font,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects,
			long count, long options);

	@Generated
	@CFunction
	public static native double CTFontGetAdvancesForGlyphs(
			CTFontRef font,
			int orientation,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize advances,
			long count);

	@Generated
	@CFunction
	public static native void CTFontGetVerticalTranslationsForGlyphs(
			CTFontRef font,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize translations,
			long count);

	@Generated
	@CFunction
	public static native CGPathRef CTFontCreatePathForGlyph(
			CTFontRef font,
			short glyph,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopyVariationAxes(CTFontRef font);

	@Generated
	@CFunction
	public static native CFDictionaryRef CTFontCopyVariation(CTFontRef font);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopyFeatures(CTFontRef font);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopyFeatureSettings(CTFontRef font);

	@Generated
	@CFunction
	public static native CGFontRef CTFontCopyGraphicsFont(CTFontRef font,
			Ptr<CTFontDescriptorRef> attributes);

	@Generated
	@CFunction
	public static native CTFontRef CTFontCreateWithGraphicsFont(
			CGFontRef graphicsFont,
			double size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			CTFontDescriptorRef attributes);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopyAvailableTables(CTFontRef font,
			int options);

	@Generated
	@CFunction
	public static native CFDataRef CTFontCopyTable(CTFontRef font, int table,
			int options);

	@Generated
	@CFunction
	public static native void CTFontDrawGlyphs(
			CTFontRef font,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions,
			long count, CGContextRef context);

	@Generated
	@CFunction
	public static native long CTFontGetLigatureCaretPositions(CTFontRef font,
			short glyph, DoublePtr positions, long maxPositions);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCopyDefaultCascadeListForLanguages(
			CTFontRef font, CFArrayRef languagePrefList);

	@Generated
	@CFunction
	public static native long CTFontCollectionGetTypeID();

	@Generated
	@CFunction
	public static native CTFontCollectionRef CTFontCollectionCreateFromAvailableFonts(
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CTFontCollectionRef CTFontCollectionCreateWithFontDescriptors(
			CFArrayRef queryDescriptors, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CTFontCollectionRef CTFontCollectionCreateCopyWithFontDescriptors(
			CTFontCollectionRef original, CFArrayRef queryDescriptors,
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptors(
			CTFontCollectionRef collection);

	@Generated
	@CFunction
	public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(
			CTFontCollectionRef collection,
			@FunctionPtr(name = "call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback") Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback sortCallback,
			VoidPtr refCon);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback {
		@Generated
		public long call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(
				VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native CFArrayRef CTFontManagerCreateFontDescriptorsFromURL(
			CFURLRef fileURL);

	@Generated
	@CFunction
	public static native CTFontDescriptorRef CTFontManagerCreateFontDescriptorFromData(
			CFDataRef data);

	@Generated
	@CFunction
	public static native boolean CTFontManagerRegisterFontsForURL(
			CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native boolean CTFontManagerUnregisterFontsForURL(
			CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native boolean CTFontManagerRegisterGraphicsFont(
			CGFontRef font, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native boolean CTFontManagerUnregisterGraphicsFont(
			CGFontRef font, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native boolean CTFontManagerRegisterFontsForURLs(
			CFArrayRef fontURLs, int scope, Ptr<CFArrayRef> errors);

	@Generated
	@CFunction
	public static native boolean CTFontManagerUnregisterFontsForURLs(
			CFArrayRef fontURLs, int scope, Ptr<CFArrayRef> errors);

	@Generated
	@CFunction
	public static native long CTFrameGetTypeID();

	@Generated
	@CFunction
	@ByValue
	public static native CFRange CTFrameGetStringRange(CTFrameRef frame);

	@Generated
	@CFunction
	@ByValue
	public static native CFRange CTFrameGetVisibleStringRange(CTFrameRef frame);

	@Generated
	@CFunction
	public static native CGPathRef CTFrameGetPath(CTFrameRef frame);

	@Generated
	@CFunction
	public static native CFDictionaryRef CTFrameGetFrameAttributes(
			CTFrameRef frame);

	@Generated
	@CFunction
	public static native CFArrayRef CTFrameGetLines(CTFrameRef frame);

	@Generated
	@CFunction
	public static native void CTFrameGetLineOrigins(
			CTFrameRef frame,
			@ByValue CFRange range,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint origins);

	@Generated
	@CFunction
	public static native void CTFrameDraw(CTFrameRef frame, CGContextRef context);

	@Generated
	@CFunction
	public static native long CTLineGetTypeID();

	@Generated
	@CFunction
	public static native CTLineRef CTLineCreateWithAttributedString(
			CFAttributedStringRef string);

	@Generated
	@CFunction
	public static native CTLineRef CTLineCreateTruncatedLine(CTLineRef line,
			double width, int truncationType, CTLineRef truncationToken);

	@Generated
	@CFunction
	public static native CTLineRef CTLineCreateJustifiedLine(CTLineRef line,
			double justificationFactor, double justificationWidth);

	@Generated
	@CFunction
	public static native long CTLineGetGlyphCount(CTLineRef line);

	@Generated
	@CFunction
	public static native CFArrayRef CTLineGetGlyphRuns(CTLineRef line);

	@Generated
	@CFunction
	@ByValue
	public static native CFRange CTLineGetStringRange(CTLineRef line);

	@Generated
	@CFunction
	public static native double CTLineGetPenOffsetForFlush(CTLineRef line,
			double flushFactor, double flushWidth);

	@Generated
	@CFunction
	public static native void CTLineDraw(CTLineRef line, CGContextRef context);

	@Generated
	@CFunction
	public static native double CTLineGetTypographicBounds(CTLineRef line,
			DoublePtr ascent, DoublePtr descent, DoublePtr leading);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTLineGetBoundsWithOptions(CTLineRef line,
			long options);

	@Generated
	@CFunction
	public static native double CTLineGetTrailingWhitespaceWidth(CTLineRef line);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTLineGetImageBounds(CTLineRef line,
			CGContextRef context);

	@Generated
	@CFunction
	public static native long CTLineGetStringIndexForPosition(CTLineRef line,
			@ByValue CGPoint position);

	@Generated
	@CFunction
	public static native double CTLineGetOffsetForStringIndex(CTLineRef line,
			long charIndex, DoublePtr secondaryOffset);

	@Generated
	@CFunction
	public static native long CTTypesetterGetTypeID();

	@Generated
	@CFunction
	public static native CTTypesetterRef CTTypesetterCreateWithAttributedString(
			CFAttributedStringRef string);

	@Generated
	@CFunction
	public static native CTTypesetterRef CTTypesetterCreateWithAttributedStringAndOptions(
			CFAttributedStringRef string, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CTLineRef CTTypesetterCreateLineWithOffset(
			CTTypesetterRef typesetter, @ByValue CFRange stringRange,
			double offset);

	@Generated
	@CFunction
	public static native CTLineRef CTTypesetterCreateLine(
			CTTypesetterRef typesetter, @ByValue CFRange stringRange);

	@Generated
	@CFunction
	public static native long CTTypesetterSuggestLineBreakWithOffset(
			CTTypesetterRef typesetter, long startIndex, double width,
			double offset);

	@Generated
	@CFunction
	public static native long CTTypesetterSuggestLineBreak(
			CTTypesetterRef typesetter, long startIndex, double width);

	@Generated
	@CFunction
	public static native long CTTypesetterSuggestClusterBreakWithOffset(
			CTTypesetterRef typesetter, long startIndex, double width,
			double offset);

	@Generated
	@CFunction
	public static native long CTTypesetterSuggestClusterBreak(
			CTTypesetterRef typesetter, long startIndex, double width);

	@Generated
	@CFunction
	public static native long CTFramesetterGetTypeID();

	@Generated
	@CFunction
	public static native CTFramesetterRef CTFramesetterCreateWithAttributedString(
			CFAttributedStringRef string);

	@Generated
	@CFunction
	public static native CTFrameRef CTFramesetterCreateFrame(
			CTFramesetterRef framesetter, @ByValue CFRange stringRange,
			CGPathRef path, CFDictionaryRef frameAttributes);

	@Generated
	@CFunction
	public static native CTTypesetterRef CTFramesetterGetTypesetter(
			CTFramesetterRef framesetter);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CTFramesetterSuggestFrameSizeWithConstraints(
			CTFramesetterRef framesetter,
			@ByValue CFRange stringRange,
			CFDictionaryRef frameAttributes,
			@ByValue CGSize constraints,
			@UncertainArgument("Options: reference, array Fallback: reference") CFRange fitRange);

	@Generated
	@CFunction
	public static native long CTGlyphInfoGetTypeID();

	@Generated
	@CFunction
	public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyphName(
			CFStringRef glyphName, CTFontRef font, CFStringRef baseString);

	@Generated
	@CFunction
	public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyph(short glyph,
			CTFontRef font, CFStringRef baseString);

	@Generated
	@CFunction
	public static native CTGlyphInfoRef CTGlyphInfoCreateWithCharacterIdentifier(
			short cid, short collection, CFStringRef baseString);

	@Generated
	@CFunction
	public static native CFStringRef CTGlyphInfoGetGlyphName(
			CTGlyphInfoRef glyphInfo);

	@Generated
	@CFunction
	public static native short CTGlyphInfoGetCharacterIdentifier(
			CTGlyphInfoRef glyphInfo);

	@Generated
	@CFunction
	public static native short CTGlyphInfoGetCharacterCollection(
			CTGlyphInfoRef glyphInfo);

	@Generated
	@CFunction
	public static native long CTParagraphStyleGetTypeID();

	@Generated
	@CFunction
	public static native CTParagraphStyleRef CTParagraphStyleCreate(
			@UncertainArgument("Options: reference, array Fallback: reference") CTParagraphStyleSetting settings,
			long settingCount);

	@Generated
	@CFunction
	public static native CTParagraphStyleRef CTParagraphStyleCreateCopy(
			CTParagraphStyleRef paragraphStyle);

	@Generated
	@CFunction
	public static native boolean CTParagraphStyleGetValueForSpecifier(
			CTParagraphStyleRef paragraphStyle, int spec, long valueBufferSize,
			VoidPtr valueBuffer);

	@Generated
	@CFunction
	public static native long CTRunGetTypeID();

	@Generated
	@CFunction
	public static native long CTRunGetGlyphCount(CTRunRef run);

	@Generated
	@CFunction
	public static native CFDictionaryRef CTRunGetAttributes(CTRunRef run);

	@Generated
	@CFunction
	public static native int CTRunGetStatus(CTRunRef run);

	@Generated
	@CFunction
	public static native ConstShortPtr CTRunGetGlyphsPtr(CTRunRef run);

	@Generated
	@CFunction
	public static native void CTRunGetGlyphs(CTRunRef run,
			@ByValue CFRange range, ShortPtr buffer);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CGPoint CTRunGetPositionsPtr(CTRunRef run);

	@Generated
	@CFunction
	public static native void CTRunGetPositions(
			CTRunRef run,
			@ByValue CFRange range,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint buffer);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CGSize CTRunGetAdvancesPtr(CTRunRef run);

	@Generated
	@CFunction
	public static native void CTRunGetAdvances(
			CTRunRef run,
			@ByValue CFRange range,
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize buffer);

	@Generated
	@CFunction
	public static native ConstLongPtr CTRunGetStringIndicesPtr(CTRunRef run);

	@Generated
	@CFunction
	public static native void CTRunGetStringIndices(CTRunRef run,
			@ByValue CFRange range, LongPtr buffer);

	@Generated
	@CFunction
	@ByValue
	public static native CFRange CTRunGetStringRange(CTRunRef run);

	@Generated
	@CFunction
	public static native double CTRunGetTypographicBounds(CTRunRef run,
			@ByValue CFRange range, DoublePtr ascent, DoublePtr descent,
			DoublePtr leading);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CTRunGetImageBounds(CTRunRef run,
			CGContextRef context, @ByValue CFRange range);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CTRunGetTextMatrix(CTRunRef run);

	@Generated
	@CFunction
	public static native void CTRunDraw(CTRunRef run, CGContextRef context,
			@ByValue CFRange range);

	@Generated
	@CFunction
	public static native long CTRunDelegateGetTypeID();

	@Generated
	@CFunction
	public static native CTRunDelegateRef CTRunDelegateCreate(
			@UncertainArgument("Options: reference, array Fallback: reference") CTRunDelegateCallbacks callbacks,
			VoidPtr refCon);

	@Generated
	@CFunction
	public static native VoidPtr CTRunDelegateGetRefCon(
			CTRunDelegateRef runDelegate);

	@Generated
	@CFunction
	public static native long CTTextTabGetTypeID();

	@Generated
	@CFunction
	public static native CTTextTabRef CTTextTabCreate(byte alignment,
			double location, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native byte CTTextTabGetAlignment(CTTextTabRef tab);

	@Generated
	@CFunction
	public static native double CTTextTabGetLocation(CTTextTabRef tab);

	@Generated
	@CFunction
	public static native CFDictionaryRef CTTextTabGetOptions(CTTextTabRef tab);

	@Generated
	@CFunction
	public static native int CTGetCoreTextVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontSymbolicTrait();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontWeightTrait();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontWidthTrait();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontSlantTrait();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontURLAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontNameAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDisplayNameAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFamilyNameAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontStyleNameAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontTraitsAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontSizeAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontMatrixAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontCascadeListAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontCharacterSetAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontLanguagesAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontBaselineAdjustAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontMacintoshEncodingsAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeaturesAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureSettingsAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFixedAdvanceAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontOrientationAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFormatAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontRegistrationScopeAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontPriorityAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontEnabledAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDownloadableAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDownloadedAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingSourceDescriptor();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingDescriptors();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingResult();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingPercentage();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingCurrentAssetSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingTotalDownloadedSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingTotalAssetSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptorMatchingError();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontCopyrightNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFamilyNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontSubFamilyNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontStyleNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontUniqueNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFullNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVersionNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontPostScriptNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontTrademarkNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontManufacturerNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDesignerNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDescriptionNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVendorURLNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontDesignerURLNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontLicenseNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontLicenseURLNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontSampleTextNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontPostScriptCIDNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAxisIdentifierKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAxisMinimumValueKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAxisMaximumValueKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAxisDefaultValueKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontVariationAxisNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureTypeIdentifierKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureTypeNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureTypeExclusiveKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureTypeSelectorsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureSelectorIdentifierKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureSelectorNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureSelectorDefaultKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontFeatureSelectorSettingKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassRoman();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassIdeographicCentered();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassIdeographicLow();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassIdeographicHigh();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassHanging();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassMath();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineReferenceFont();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineOriginalFont();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontCollectionRemoveDuplicatesOption();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontManagerErrorDomain();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontManagerErrorFontURLsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFrameProgressionAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFramePathFillRuleAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFramePathWidthAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFrameClippingPathsAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFramePathClippingPathAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTTypesetterOptionDisableBidiProcessing();

	@Generated
	@CVariable()
	public static native CFStringRef kCTTypesetterOptionForcedEmbeddingLevel();

	@Generated
	@CVariable()
	public static native CFStringRef kCTFontAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTForegroundColorFromContextAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTKernAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTLigatureAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTForegroundColorAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTParagraphStyleAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTStrokeWidthAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTStrokeColorAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTUnderlineStyleAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTSuperscriptAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTUnderlineColorAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTVerticalFormsAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTGlyphInfoAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTCharacterShapeAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTLanguageAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTRunDelegateAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineClassAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineInfoAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTBaselineReferenceInfoAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTWritingDirectionAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kCTTabColumnTerminatorsAttributeName();
}
