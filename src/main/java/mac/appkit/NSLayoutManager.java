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
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSGlyphStorage;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutManager extends NSObject implements NSCoding,
		NSGlyphStorage {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLayoutManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTemporaryAttribute:value:forCharacterRange:")
	public native void addTemporaryAttributeValueForCharacterRange(
			String attrName, @Mapped(ObjCObjectMapper.class) Object value,
			@ByValue NSRange charRange);

	@Generated
	@Selector("addTemporaryAttributes:forCharacterRange:")
	public native void addTemporaryAttributesForCharacterRange(
			NSDictionary attrs, @ByValue NSRange charRange);

	@Generated
	@Selector("addTextContainer:")
	public native void addTextContainer(NSTextContainer container);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLayoutManager alloc();

	@Generated
	@Selector("allowsNonContiguousLayout")
	public native boolean allowsNonContiguousLayout();

	@Generated
	@Selector("attachmentSizeForGlyphAtIndex:")
	@ByValue
	public native CGSize attachmentSizeForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("attributedString")
	public native NSAttributedString attributedString();

	@Generated
	@Selector("backgroundLayoutEnabled")
	public native boolean backgroundLayoutEnabled();

	@Generated
	@Selector("boundingRectForGlyphRange:inTextContainer:")
	@ByValue
	public native CGRect boundingRectForGlyphRangeInTextContainer(
			@ByValue NSRange glyphRange, NSTextContainer container);

	@Generated
	@Selector("boundsRectForTextBlock:atIndex:effectiveRange:")
	@ByValue
	public native CGRect boundsRectForTextBlockAtIndexEffectiveRange(
			NSTextBlock block,
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange);

	@Generated
	@Selector("boundsRectForTextBlock:glyphRange:")
	@ByValue
	public native CGRect boundsRectForTextBlockGlyphRange(NSTextBlock block,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("characterIndexForGlyphAtIndex:")
	public native long characterIndexForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
	public native long characterIndexForPointInTextContainerFractionOfDistanceBetweenInsertionPoints(
			@ByValue CGPoint point, NSTextContainer container,
			DoublePtr partialFraction);

	@Generated
	@Selector("characterRangeForGlyphRange:actualGlyphRange:")
	@ByValue
	public native NSRange characterRangeForGlyphRangeActualGlyphRange(
			@ByValue NSRange glyphRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualGlyphRange);

	@Generated
	@Selector("defaultAttachmentScaling")
	public native long defaultAttachmentScaling();

	@Generated
	@Selector("defaultBaselineOffsetForFont:")
	public native double defaultBaselineOffsetForFont(NSFont theFont);

	@Generated
	@Selector("defaultLineHeightForFont:")
	public native double defaultLineHeightForFont(NSFont theFont);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deleteGlyphsInRange:")
	public native void deleteGlyphsInRange(@ByValue NSRange glyphRange);

	@Generated
	@Selector("drawBackgroundForGlyphRange:atPoint:")
	public native void drawBackgroundForGlyphRangeAtPoint(
			@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

	@Generated
	@Selector("drawGlyphsForGlyphRange:atPoint:")
	public native void drawGlyphsForGlyphRangeAtPoint(
			@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

	@Generated
	@Selector("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
	public native void drawStrikethroughForGlyphRangeStrikethroughTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
			@ByValue NSRange glyphRange, long strikethroughVal,
			double baselineOffset, @ByValue CGRect lineRect,
			@ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

	@Generated
	@Selector("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
	public native void drawUnderlineForGlyphRangeUnderlineTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
			@ByValue NSRange glyphRange, long underlineVal,
			double baselineOffset, @ByValue CGRect lineRect,
			@ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

	@Generated
	@Selector("drawsOutsideLineFragmentForGlyphAtIndex:")
	public native boolean drawsOutsideLineFragmentForGlyphAtIndex(
			long glyphIndex);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("ensureGlyphsForCharacterRange:")
	public native void ensureGlyphsForCharacterRange(@ByValue NSRange charRange);

	@Generated
	@Selector("ensureGlyphsForGlyphRange:")
	public native void ensureGlyphsForGlyphRange(@ByValue NSRange glyphRange);

	@Generated
	@Selector("ensureLayoutForBoundingRect:inTextContainer:")
	public native void ensureLayoutForBoundingRectInTextContainer(
			@ByValue CGRect bounds, NSTextContainer container);

	@Generated
	@Selector("ensureLayoutForCharacterRange:")
	public native void ensureLayoutForCharacterRange(@ByValue NSRange charRange);

	@Generated
	@Selector("ensureLayoutForGlyphRange:")
	public native void ensureLayoutForGlyphRange(@ByValue NSRange glyphRange);

	@Generated
	@Selector("ensureLayoutForTextContainer:")
	public native void ensureLayoutForTextContainer(NSTextContainer container);

	@Generated
	@Selector("extraLineFragmentRect")
	@ByValue
	public native CGRect extraLineFragmentRect();

	@Generated
	@Selector("extraLineFragmentTextContainer")
	public native NSTextContainer extraLineFragmentTextContainer();

	@Generated
	@Selector("extraLineFragmentUsedRect")
	@ByValue
	public native CGRect extraLineFragmentUsedRect();

	@Generated
	@Selector("fillBackgroundRectArray:count:forCharacterRange:color:")
	public native void fillBackgroundRectArrayCountForCharacterRangeColor(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rectArray,
			long rectCount, @ByValue NSRange charRange, NSColor color);

	@Generated
	@Selector("firstTextView")
	public native NSTextView firstTextView();

	@Generated
	@Selector("firstUnlaidCharacterIndex")
	public native long firstUnlaidCharacterIndex();

	@Generated
	@Selector("firstUnlaidGlyphIndex")
	public native long firstUnlaidGlyphIndex();

	@Generated
	@Selector("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
	public native double fractionOfDistanceThroughGlyphForPointInTextContainer(
			@ByValue CGPoint point, NSTextContainer container);

	@Generated
	@Selector("getFirstUnlaidCharacterIndex:glyphIndex:")
	public native void getFirstUnlaidCharacterIndexGlyphIndex(
			LongPtr charIndex, LongPtr glyphIndex);

	@Generated
	@Selector("getGlyphs:range:")
	public native long getGlyphsRange(IntPtr glyphArray,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:")
	public native long getGlyphsInRangeGlyphsCharacterIndexesGlyphInscriptionsElasticBits(
			@ByValue NSRange glyphRange, IntPtr glyphBuffer,
			LongPtr charIndexBuffer, LongPtr inscribeBuffer,
			BoolPtr elasticBuffer);

	@Generated
	@Selector("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:")
	public native long getGlyphsInRangeGlyphsCharacterIndexesGlyphInscriptionsElasticBitsBidiLevels(
			@ByValue NSRange glyphRange, IntPtr glyphBuffer,
			LongPtr charIndexBuffer, LongPtr inscribeBuffer,
			BoolPtr elasticBuffer, BytePtr bidiLevelBuffer);

	@Generated
	@Selector("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
	public native long getLineFragmentInsertionPointsForCharacterAtIndexAlternatePositionsInDisplayOrderPositionsCharacterIndexes(
			long charIndex, boolean aFlag, boolean dFlag, DoublePtr positions,
			LongPtr charIndexes);

	@Generated
	@Selector("glyphAtIndex:")
	public native int glyphAtIndex(long glyphIndex);

	@Generated
	@Selector("glyphAtIndex:isValidIndex:")
	public native int glyphAtIndexIsValidIndex(long glyphIndex,
			BoolPtr isValidIndex);

	@Generated
	@Selector("glyphGenerator")
	public native NSGlyphGenerator glyphGenerator();

	@Generated
	@Selector("glyphIndexForCharacterAtIndex:")
	public native long glyphIndexForCharacterAtIndex(long charIndex);

	@Generated
	@Selector("glyphIndexForPoint:inTextContainer:")
	public native long glyphIndexForPointInTextContainer(
			@ByValue CGPoint point, NSTextContainer container);

	@Generated
	@Selector("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
	public native long glyphIndexForPointInTextContainerFractionOfDistanceThroughGlyph(
			@ByValue CGPoint point, NSTextContainer container,
			DoublePtr partialFraction);

	@Generated
	@Selector("glyphRangeForBoundingRect:inTextContainer:")
	@ByValue
	public native NSRange glyphRangeForBoundingRectInTextContainer(
			@ByValue CGRect bounds, NSTextContainer container);

	@Generated
	@Selector("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
	@ByValue
	public native NSRange glyphRangeForBoundingRectWithoutAdditionalLayoutInTextContainer(
			@ByValue CGRect bounds, NSTextContainer container);

	@Generated
	@Selector("glyphRangeForCharacterRange:actualCharacterRange:")
	@ByValue
	public native NSRange glyphRangeForCharacterRangeActualCharacterRange(
			@ByValue NSRange charRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualCharRange);

	@Generated
	@Selector("glyphRangeForTextContainer:")
	@ByValue
	public native NSRange glyphRangeForTextContainer(NSTextContainer container);

	@Generated
	@Selector("hasNonContiguousLayout")
	public native boolean hasNonContiguousLayout();

	@Generated
	@Selector("hyphenationFactor")
	public native float hyphenationFactor();

	@Generated
	@Selector("init")
	public native NSLayoutManager init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("insertGlyph:atGlyphIndex:characterIndex:")
	public native void insertGlyphAtGlyphIndexCharacterIndex(int glyph,
			long glyphIndex, long charIndex);

	@Generated
	@Selector("insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:")
	public native void insertGlyphsLengthForStartingGlyphAtIndexCharacterIndex(
			ConstIntPtr glyphs, long length, long glyphIndex, long charIndex);

	@Generated
	@Selector("insertTextContainer:atIndex:")
	public native void insertTextContainerAtIndex(NSTextContainer container,
			long index);

	@Generated
	@Selector("intAttribute:forGlyphAtIndex:")
	public native long intAttributeForGlyphAtIndex(long attributeTag,
			long glyphIndex);

	@Generated
	@Selector("invalidateDisplayForCharacterRange:")
	public native void invalidateDisplayForCharacterRange(
			@ByValue NSRange charRange);

	@Generated
	@Selector("invalidateDisplayForGlyphRange:")
	public native void invalidateDisplayForGlyphRange(
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
	public native void invalidateGlyphsForCharacterRangeChangeInLengthActualCharacterRange(
			@ByValue NSRange charRange,
			long delta,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualCharRange);

	@Generated
	@Selector("invalidateGlyphsOnLayoutInvalidationForGlyphRange:")
	public native void invalidateGlyphsOnLayoutInvalidationForGlyphRange(
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("invalidateLayoutForCharacterRange:actualCharacterRange:")
	public native void invalidateLayoutForCharacterRangeActualCharacterRange(
			@ByValue NSRange charRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualCharRange);

	@Generated
	@Selector("invalidateLayoutForCharacterRange:isSoft:actualCharacterRange:")
	public native void invalidateLayoutForCharacterRangeIsSoftActualCharacterRange(
			@ByValue NSRange charRange,
			boolean flag,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualCharRange);

	@Generated
	@Selector("isValidGlyphIndex:")
	public native boolean isValidGlyphIndex(long glyphIndex);

	@Generated
	@Selector("layoutManagerOwnsFirstResponderInWindow:")
	public native boolean layoutManagerOwnsFirstResponderInWindow(
			NSWindow window);

	@Generated
	@Selector("layoutOptions")
	public native long layoutOptions();

	@Generated
	@Selector("layoutRectForTextBlock:atIndex:effectiveRange:")
	@ByValue
	public native CGRect layoutRectForTextBlockAtIndexEffectiveRange(
			NSTextBlock block,
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange);

	@Generated
	@Selector("layoutRectForTextBlock:glyphRange:")
	@ByValue
	public native CGRect layoutRectForTextBlockGlyphRange(NSTextBlock block,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:")
	@ByValue
	public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRange(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange);

	@Generated
	@Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
	@ByValue
	public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange,
			boolean flag);

	@Generated
	@Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
	@ByValue
	public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRange(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange);

	@Generated
	@Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
	@ByValue
	public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange,
			boolean flag);

	@Generated
	@Selector("locationForGlyphAtIndex:")
	@ByValue
	public native CGPoint locationForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("notShownAttributeForGlyphAtIndex:")
	public native boolean notShownAttributeForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("numberOfGlyphs")
	public native long numberOfGlyphs();

	@Generated
	@Selector("rangeOfNominallySpacedGlyphsContainingIndex:")
	@ByValue
	public native NSRange rangeOfNominallySpacedGlyphsContainingIndex(
			long glyphIndex);

	@Generated
	@Selector("rectArrayForCharacterRange:withinSelectedCharacterRange:inTextContainer:rectCount:")
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CGRect rectArrayForCharacterRangeWithinSelectedCharacterRangeInTextContainerRectCount(
			@ByValue NSRange charRange, @ByValue NSRange selCharRange,
			NSTextContainer container, LongPtr rectCount);

	@Generated
	@Selector("rectArrayForGlyphRange:withinSelectedGlyphRange:inTextContainer:rectCount:")
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CGRect rectArrayForGlyphRangeWithinSelectedGlyphRangeInTextContainerRectCount(
			@ByValue NSRange glyphRange, @ByValue NSRange selGlyphRange,
			NSTextContainer container, LongPtr rectCount);

	@Generated
	@Selector("removeTemporaryAttribute:forCharacterRange:")
	public native void removeTemporaryAttributeForCharacterRange(
			String attrName, @ByValue NSRange charRange);

	@Generated
	@Selector("removeTextContainerAtIndex:")
	public native void removeTextContainerAtIndex(long index);

	@Generated
	@Selector("replaceGlyphAtIndex:withGlyph:")
	public native void replaceGlyphAtIndexWithGlyph(long glyphIndex,
			int newGlyph);

	@Generated
	@Selector("replaceTextStorage:")
	public native void replaceTextStorage(NSTextStorage newTextStorage);

	@Generated
	@Selector("rulerAccessoryViewForTextView:paragraphStyle:ruler:enabled:")
	public native NSView rulerAccessoryViewForTextViewParagraphStyleRulerEnabled(
			NSTextView view, NSParagraphStyle style, NSRulerView ruler,
			boolean isEnabled);

	@Generated
	@Selector("rulerMarkersForTextView:paragraphStyle:ruler:")
	public native NSArray rulerMarkersForTextViewParagraphStyleRuler(
			NSTextView view, NSParagraphStyle style, NSRulerView ruler);

	@Generated
	@Selector("setAllowsNonContiguousLayout:")
	public native void setAllowsNonContiguousLayout(boolean flag);

	@Generated
	@Selector("setAttachmentSize:forGlyphRange:")
	public native void setAttachmentSizeForGlyphRange(
			@ByValue CGSize attachmentSize, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setBackgroundLayoutEnabled:")
	public native void setBackgroundLayoutEnabled(boolean flag);

	@Generated
	@Selector("setBoundsRect:forTextBlock:glyphRange:")
	public native void setBoundsRectForTextBlockGlyphRange(
			@ByValue CGRect rect, NSTextBlock block, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setCharacterIndex:forGlyphAtIndex:")
	public native void setCharacterIndexForGlyphAtIndex(long charIndex,
			long glyphIndex);

	@Generated
	@Selector("setDefaultAttachmentScaling:")
	public native void setDefaultAttachmentScaling(long scaling);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDrawsOutsideLineFragment:forGlyphAtIndex:")
	public native void setDrawsOutsideLineFragmentForGlyphAtIndex(boolean flag,
			long glyphIndex);

	@Generated
	@Selector("setExtraLineFragmentRect:usedRect:textContainer:")
	public native void setExtraLineFragmentRectUsedRectTextContainer(
			@ByValue CGRect fragmentRect, @ByValue CGRect usedRect,
			NSTextContainer container);

	@Generated
	@Selector("setGlyphGenerator:")
	public native void setGlyphGenerator(NSGlyphGenerator glyphGenerator);

	@Generated
	@Selector("setHyphenationFactor:")
	public native void setHyphenationFactor(float factor);

	@Generated
	@Selector("setIntAttribute:value:forGlyphAtIndex:")
	public native void setIntAttributeValueForGlyphAtIndex(long attributeTag,
			long val, long glyphIndex);

	@Generated
	@Selector("setLayoutRect:forTextBlock:glyphRange:")
	public native void setLayoutRectForTextBlockGlyphRange(
			@ByValue CGRect rect, NSTextBlock block, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setLineFragmentRect:forGlyphRange:usedRect:")
	public native void setLineFragmentRectForGlyphRangeUsedRect(
			@ByValue CGRect fragmentRect, @ByValue NSRange glyphRange,
			@ByValue CGRect usedRect);

	@Generated
	@Selector("setLocation:forStartOfGlyphRange:")
	public native void setLocationForStartOfGlyphRange(
			@ByValue CGPoint location, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setLocations:startingGlyphIndexes:count:forGlyphRange:")
	public native void setLocationsStartingGlyphIndexesCountForGlyphRange(
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint locations,
			LongPtr glyphIndexes, long count, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setNotShownAttribute:forGlyphAtIndex:")
	public native void setNotShownAttributeForGlyphAtIndex(boolean flag,
			long glyphIndex);

	@Generated
	@Selector("setShowsControlCharacters:")
	public native void setShowsControlCharacters(boolean flag);

	@Generated
	@Selector("setShowsInvisibleCharacters:")
	public native void setShowsInvisibleCharacters(boolean flag);

	@Generated
	@Selector("setTemporaryAttributes:forCharacterRange:")
	public native void setTemporaryAttributesForCharacterRange(
			NSDictionary attrs, @ByValue NSRange charRange);

	@Generated
	@Selector("setTextContainer:forGlyphRange:")
	public native void setTextContainerForGlyphRange(NSTextContainer container,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setTextStorage:")
	public native void setTextStorage(NSTextStorage textStorage);

	@Generated
	@Selector("setTypesetter:")
	public native void setTypesetter(NSTypesetter typesetter);

	@Generated
	@Selector("setTypesetterBehavior:")
	public native void setTypesetterBehavior(long theBehavior);

	@Generated
	@Selector("setUsesFontLeading:")
	public native void setUsesFontLeading(boolean flag);

	@Generated
	@Selector("setUsesScreenFonts:")
	public native void setUsesScreenFonts(boolean flag);

	@Generated
	@Selector("showAttachmentCell:inRect:characterIndex:")
	public native void showAttachmentCellInRectCharacterIndex(NSCell cell,
			@ByValue CGRect rect, long attachmentIndex);

	@Generated
	@Selector("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
	public native void showCGGlyphsPositionsCountFontMatrixAttributesInContext(
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions,
			long glyphCount, NSFont font, NSAffineTransform textMatrix,
			NSDictionary attributes, NSGraphicsContext graphicsContext);

	@Generated
	@Selector("showPackedGlyphs:length:glyphRange:atPoint:font:color:printingAdjustment:")
	public native void showPackedGlyphsLengthGlyphRangeAtPointFontColorPrintingAdjustment(
			BytePtr glyphs, long glyphLen, @ByValue NSRange glyphRange,
			@ByValue CGPoint point, NSFont font, NSColor color,
			@ByValue CGSize printingAdjustment);

	@Generated
	@Selector("showsControlCharacters")
	public native boolean showsControlCharacters();

	@Generated
	@Selector("showsInvisibleCharacters")
	public native boolean showsInvisibleCharacters();

	@Generated
	@Selector("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
	public native void strikethroughGlyphRangeStrikethroughTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
			@ByValue NSRange glyphRange, long strikethroughVal,
			@ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange,
			@ByValue CGPoint containerOrigin);

	@Generated
	@Selector("substituteFontForFont:")
	public native NSFont substituteFontForFont(NSFont originalFont);

	@Generated
	@Selector("temporaryAttribute:atCharacterIndex:effectiveRange:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object temporaryAttributeAtCharacterIndexEffectiveRange(
			String attrName,
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range);

	@Generated
	@Selector("temporaryAttribute:atCharacterIndex:longestEffectiveRange:inRange:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object temporaryAttributeAtCharacterIndexLongestEffectiveRangeInRange(
			String attrName,
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range,
			@ByValue NSRange rangeLimit);

	@Generated
	@Selector("temporaryAttributesAtCharacterIndex:effectiveRange:")
	public native NSDictionary temporaryAttributesAtCharacterIndexEffectiveRange(
			long charIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveCharRange);

	@Generated
	@Selector("temporaryAttributesAtCharacterIndex:longestEffectiveRange:inRange:")
	public native NSDictionary temporaryAttributesAtCharacterIndexLongestEffectiveRangeInRange(
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range,
			@ByValue NSRange rangeLimit);

	@Generated
	@Selector("textContainerChangedGeometry:")
	public native void textContainerChangedGeometry(NSTextContainer container);

	@Generated
	@Selector("textContainerChangedTextView:")
	public native void textContainerChangedTextView(NSTextContainer container);

	@Generated
	@Selector("textContainerForGlyphAtIndex:effectiveRange:")
	public native NSTextContainer textContainerForGlyphAtIndexEffectiveRange(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange);

	@Generated
	@Selector("textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
	public native NSTextContainer textContainerForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
			long glyphIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveGlyphRange,
			boolean flag);

	@Generated
	@Selector("textContainers")
	public native NSArray textContainers();

	@Generated
	@Selector("textStorage")
	public native NSTextStorage textStorage();

	@Generated
	@Selector("textStorage:edited:range:changeInLength:invalidatedRange:")
	public native void textStorageEditedRangeChangeInLengthInvalidatedRange(
			NSTextStorage str, long editedMask, @ByValue NSRange newCharRange,
			long delta, @ByValue NSRange invalidatedCharRange);

	@Generated
	@Selector("textViewForBeginningOfSelection")
	public native NSTextView textViewForBeginningOfSelection();

	@Generated
	@Selector("typesetter")
	public native NSTypesetter typesetter();

	@Generated
	@Selector("typesetterBehavior")
	public native long typesetterBehavior();

	@Generated
	@Selector("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
	public native void underlineGlyphRangeUnderlineTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
			@ByValue NSRange glyphRange, long underlineVal,
			@ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange,
			@ByValue CGPoint containerOrigin);

	@Generated
	@Selector("usedRectForTextContainer:")
	@ByValue
	public native CGRect usedRectForTextContainer(NSTextContainer container);

	@Generated
	@Selector("usesFontLeading")
	public native boolean usesFontLeading();

	@Generated
	@Selector("usesScreenFonts")
	public native boolean usesScreenFonts();
}
