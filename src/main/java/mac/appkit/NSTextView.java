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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.*;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextView extends NSText implements NSTextInput,
		NSUserInterfaceValidations, NSTextInputClient,
		NSTextLayoutOrientationProvider, NSDraggingSource {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptableDragTypes")
	public native NSArray acceptableDragTypes();

	@Generated
	@Selector("acceptsGlyphInfo")
	public native boolean acceptsGlyphInfo();

	@Generated
	@Selector("alignJustified:")
	public native void alignJustified(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextView alloc();

	@Generated
	@Selector("allowedInputSourceLocales")
	public native NSArray allowedInputSourceLocales();

	@Generated
	@Selector("allowsDocumentBackgroundColorChange")
	public native boolean allowsDocumentBackgroundColorChange();

	@Generated
	@Selector("allowsImageEditing")
	public native boolean allowsImageEditing();

	@Generated
	@Selector("allowsUndo")
	public native boolean allowsUndo();

	@Generated
	@IsOptional
	@Selector("attributedString")
	public native NSAttributedString attributedString();

	@Generated
	@Selector("attributedSubstringForProposedRange:actualRange:")
	public native NSAttributedString attributedSubstringForProposedRangeActualRange(
			@ByValue NSRange aRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualRange);

	@Generated
	@Selector("attributedSubstringFromRange:")
	public native NSAttributedString attributedSubstringFromRange(
			@ByValue NSRange theRange);

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@IsOptional
	@Selector("baselineDeltaForCharacterAtIndex:")
	public native double baselineDeltaForCharacterAtIndex(long anIndex);

	@Generated
	@Selector("breakUndoCoalescing")
	public native void breakUndoCoalescing();

	@Generated
	@Selector("changeAttributes:")
	public native void changeAttributes(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeColor:")
	public native void changeColor(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeDocumentBackgroundColor:")
	public native void changeDocumentBackgroundColor(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeLayoutOrientation:")
	public native void changeLayoutOrientation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("characterIndexForInsertionAtPoint:")
	public native long characterIndexForInsertionAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("characterIndexForPoint:")
	public native long characterIndexForPoint(@ByValue CGPoint thePoint);

	@Generated
	@Selector("checkTextInDocument:")
	public native void checkTextInDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("checkTextInRange:types:options:")
	public native void checkTextInRangeTypesOptions(@ByValue NSRange range,
			long checkingTypes, NSDictionary options);

	@Generated
	@Selector("checkTextInSelection:")
	public native void checkTextInSelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("cleanUpAfterDragOperation")
	public native void cleanUpAfterDragOperation();

	@Generated
	@Selector("clickedOnLink:atIndex:")
	public native void clickedOnLinkAtIndex(
			@Mapped(ObjCObjectMapper.class) Object link, long charIndex);

	@Generated
	@Selector("complete:")
	public native void complete(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("completionsForPartialWordRange:indexOfSelectedItem:")
	public native NSArray completionsForPartialWordRangeIndexOfSelectedItem(
			@ByValue NSRange charRange, LongPtr index);

	@Generated
	@Selector("conversationIdentifier")
	public native long conversationIdentifier();

	@Generated
	@Selector("defaultParagraphStyle")
	public native NSParagraphStyle defaultParagraphStyle();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("didChangeText")
	public native void didChangeText();

	@Generated
	@Selector("displaysLinkToolTips")
	public native boolean displaysLinkToolTips();

	@Generated
	@Selector("doCommandBySelector:")
	public native void doCommandBySelector(SEL aSelector);

	@Generated
	@Selector("dragImageForSelectionWithEvent:origin:")
	public native NSImage dragImageForSelectionWithEventOrigin(
			NSEvent event,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint origin);

	@Generated
	@Selector("dragOperationForDraggingInfo:type:")
	public native long dragOperationForDraggingInfoType(
			@Mapped(ObjCObjectMapper.class) Object dragInfo, String type);

	@Generated
	@Selector("dragSelectionWithEvent:offset:slideBack:")
	public native boolean dragSelectionWithEventOffsetSlideBack(NSEvent event,
			@ByValue CGSize mouseOffset, boolean slideBack);

	@Generated
	@IsOptional
	@Selector("draggingSession:endedAtPoint:operation:")
	public native void draggingSessionEndedAtPointOperation(
			NSDraggingSession session, @ByValue CGPoint screenPoint,
			long operation);

	@Generated
	@IsOptional
	@Selector("draggingSession:movedToPoint:")
	public native void draggingSessionMovedToPoint(NSDraggingSession session,
			@ByValue CGPoint screenPoint);

	@Generated
	@Selector("draggingSession:sourceOperationMaskForDraggingContext:")
	public native long draggingSessionSourceOperationMaskForDraggingContext(
			NSDraggingSession session, long context);

	@Generated
	@IsOptional
	@Selector("draggingSession:willBeginAtPoint:")
	public native void draggingSessionWillBeginAtPoint(
			NSDraggingSession session, @ByValue CGPoint screenPoint);

	@Generated
	@Selector("drawInsertionPointInRect:color:turnedOn:")
	public native void drawInsertionPointInRectColorTurnedOn(
			@ByValue CGRect rect, NSColor color, boolean flag);

	@Generated
	@Selector("drawViewBackgroundInRect:")
	public native void drawViewBackgroundInRect(@ByValue CGRect rect);

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@IsOptional
	@Selector("drawsVerticallyForCharacterAtIndex:")
	public native boolean drawsVerticallyForCharacterAtIndex(long charIndex);

	@Generated
	@Selector("enabledTextCheckingTypes")
	public native long enabledTextCheckingTypes();

	@Generated
	@Selector("firstRectForCharacterRange:")
	@ByValue
	public native CGRect firstRectForCharacterRange(@ByValue NSRange theRange);

	@Generated
	@Selector("firstRectForCharacterRange:actualRange:")
	@ByValue
	public native CGRect firstRectForCharacterRangeActualRange(
			@ByValue NSRange aRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualRange);

	@Generated
	@IsOptional
	@Selector("fractionOfDistanceThroughGlyphForPoint:")
	public native double fractionOfDistanceThroughGlyphForPoint(
			@ByValue CGPoint aPoint);

	@Generated
	@Selector("handleTextCheckingResults:forRange:types:options:orthography:wordCount:")
	public native void handleTextCheckingResultsForRangeTypesOptionsOrthographyWordCount(
			NSArray results, @ByValue NSRange range, long checkingTypes,
			NSDictionary options, NSOrthography orthography, long wordCount);

	@Generated
	@Selector("hasMarkedText")
	public native boolean hasMarkedText();

	@Generated
	@IsOptional
	@Selector("ignoreModifierKeysForDraggingSession:")
	public native boolean ignoreModifierKeysForDraggingSession(
			NSDraggingSession session);

	@Generated
	@Selector("importsGraphics")
	public native boolean importsGraphics();

	@Generated
	@Selector("init")
	public native NSTextView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTextView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("initWithFrame:textContainer:")
	public native NSTextView initWithFrameTextContainer(
			@ByValue CGRect frameRect, NSTextContainer container);

	@Generated
	@Selector("insertCompletion:forPartialWordRange:movement:isFinal:")
	public native void insertCompletionForPartialWordRangeMovementIsFinal(
			String word, @ByValue NSRange charRange, long movement, boolean flag);

	@Generated
	@Selector("insertText:")
	public native void insertText(
			@Mapped(ObjCObjectMapper.class) Object insertString);

	@Generated
	@Selector("insertText:replacementRange:")
	public native void insertTextReplacementRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange replacementRange);

	@Generated
	@Selector("insertionPointColor")
	public native NSColor insertionPointColor();

	@Generated
	@Selector("invalidateTextContainerOrigin")
	public native void invalidateTextContainerOrigin();

	@Generated
	@Selector("isAutomaticDashSubstitutionEnabled")
	public native boolean isAutomaticDashSubstitutionEnabled();

	@Generated
	@Selector("isAutomaticDataDetectionEnabled")
	public native boolean isAutomaticDataDetectionEnabled();

	@Generated
	@Selector("isAutomaticLinkDetectionEnabled")
	public native boolean isAutomaticLinkDetectionEnabled();

	@Generated
	@Selector("isAutomaticQuoteSubstitutionEnabled")
	public native boolean isAutomaticQuoteSubstitutionEnabled();

	@Generated
	@Selector("isAutomaticSpellingCorrectionEnabled")
	public native boolean isAutomaticSpellingCorrectionEnabled();

	@Generated
	@Selector("isAutomaticTextReplacementEnabled")
	public native boolean isAutomaticTextReplacementEnabled();

	@Generated
	@Selector("isCoalescingUndo")
	public native boolean isCoalescingUndo();

	@Generated
	@Selector("isContinuousSpellCheckingEnabled")
	public native boolean isContinuousSpellCheckingEnabled();

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("isFieldEditor")
	public native boolean isFieldEditor();

	@Generated
	@Selector("isGrammarCheckingEnabled")
	public native boolean isGrammarCheckingEnabled();

	@Generated
	@Selector("isIncrementalSearchingEnabled")
	public native boolean isIncrementalSearchingEnabled();

	@Generated
	@Selector("isRichText")
	public native boolean isRichText();

	@Generated
	@Selector("isRulerVisible")
	public native boolean isRulerVisible();

	@Generated
	@Selector("isSelectable")
	public native boolean isSelectable();

	@Generated
	@Selector("layoutManager")
	public native NSLayoutManager layoutManager();

	@Generated
	@Selector("layoutOrientation")
	public native long layoutOrientation();

	@Generated
	@Selector("linkTextAttributes")
	public native NSDictionary linkTextAttributes();

	@Generated
	@Selector("loosenKerning:")
	public native void loosenKerning(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("lowerBaseline:")
	public native void lowerBaseline(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("markedRange")
	@ByValue
	public native NSRange markedRange();

	@Generated
	@Selector("markedTextAttributes")
	public native NSDictionary markedTextAttributes();

	@Generated
	@Selector("orderFrontLinkPanel:")
	public native void orderFrontLinkPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontListPanel:")
	public native void orderFrontListPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontSharingServicePicker:")
	public native void orderFrontSharingServicePicker(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontSpacingPanel:")
	public native void orderFrontSpacingPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontSubstitutionsPanel:")
	public native void orderFrontSubstitutionsPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontTablePanel:")
	public native void orderFrontTablePanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("outline:")
	public native void outline(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pasteAsPlainText:")
	public native void pasteAsPlainText(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pasteAsRichText:")
	public native void pasteAsRichText(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("performFindPanelAction:")
	public native void performFindPanelAction(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("preferredPasteboardTypeFromArray:restrictedToTypesFromArray:")
	public native String preferredPasteboardTypeFromArrayRestrictedToTypesFromArray(
			NSArray availableTypes, NSArray allowedTypes);

	@Generated
	@Selector("quickLookPreviewableItemsInRanges:")
	public native NSArray quickLookPreviewableItemsInRanges(NSArray ranges);

	@Generated
	@Selector("raiseBaseline:")
	public native void raiseBaseline(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("rangeForUserCharacterAttributeChange")
	@ByValue
	public native NSRange rangeForUserCharacterAttributeChange();

	@Generated
	@Selector("rangeForUserCompletion")
	@ByValue
	public native NSRange rangeForUserCompletion();

	@Generated
	@Selector("rangeForUserParagraphAttributeChange")
	@ByValue
	public native NSRange rangeForUserParagraphAttributeChange();

	@Generated
	@Selector("rangeForUserTextChange")
	@ByValue
	public native NSRange rangeForUserTextChange();

	@Generated
	@Selector("rangesForUserCharacterAttributeChange")
	public native NSArray rangesForUserCharacterAttributeChange();

	@Generated
	@Selector("rangesForUserParagraphAttributeChange")
	public native NSArray rangesForUserParagraphAttributeChange();

	@Generated
	@Selector("rangesForUserTextChange")
	public native NSArray rangesForUserTextChange();

	@Generated
	@Selector("readSelectionFromPasteboard:")
	public native boolean readSelectionFromPasteboard(NSPasteboard pboard);

	@Generated
	@Selector("readSelectionFromPasteboard:type:")
	public native boolean readSelectionFromPasteboardType(NSPasteboard pboard,
			String type);

	@Generated
	@Selector("readablePasteboardTypes")
	public native NSArray readablePasteboardTypes();

	@Generated
	@Selector("registerForServices")
	public static native void registerForServices();

	@Generated
	@Selector("replaceTextContainer:")
	public native void replaceTextContainer(NSTextContainer newContainer);

	@Generated
	@Selector("rulerView:didAddMarker:")
	public native void rulerViewDidAddMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:didMoveMarker:")
	public native void rulerViewDidMoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:didRemoveMarker:")
	public native void rulerViewDidRemoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:handleMouseDown:")
	public native void rulerViewHandleMouseDown(NSRulerView ruler, NSEvent event);

	@Generated
	@Selector("rulerView:shouldAddMarker:")
	public native boolean rulerViewShouldAddMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:shouldMoveMarker:")
	public native boolean rulerViewShouldMoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:shouldRemoveMarker:")
	public native boolean rulerViewShouldRemoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:willAddMarker:atLocation:")
	public native double rulerViewWillAddMarkerAtLocation(NSRulerView ruler,
			NSRulerMarker marker, double location);

	@Generated
	@Selector("rulerView:willMoveMarker:toLocation:")
	public native double rulerViewWillMoveMarkerToLocation(NSRulerView ruler,
			NSRulerMarker marker, double location);

	@Generated
	@Selector("selectedRange")
	@ByValue
	public native NSRange selectedRange();

	@Generated
	@Selector("selectedRanges")
	public native NSArray selectedRanges();

	@Generated
	@Selector("selectedTextAttributes")
	public native NSDictionary selectedTextAttributes();

	@Generated
	@Selector("selectionAffinity")
	public native long selectionAffinity();

	@Generated
	@Selector("selectionGranularity")
	public native long selectionGranularity();

	@Generated
	@Selector("selectionRangeForProposedRange:granularity:")
	@ByValue
	public native NSRange selectionRangeForProposedRangeGranularity(
			@ByValue NSRange proposedCharRange, long granularity);

	@Generated
	@Selector("setAcceptsGlyphInfo:")
	public native void setAcceptsGlyphInfo(boolean flag);

	@Generated
	@Selector("setAlignment:range:")
	public native void setAlignmentRange(long alignment, @ByValue NSRange range);

	@Generated
	@Selector("setAllowedInputSourceLocales:")
	public native void setAllowedInputSourceLocales(NSArray localeIdentifiers);

	@Generated
	@Selector("setAllowsDocumentBackgroundColorChange:")
	public native void setAllowsDocumentBackgroundColorChange(boolean flag);

	@Generated
	@Selector("setAllowsImageEditing:")
	public native void setAllowsImageEditing(boolean flag);

	@Generated
	@Selector("setAllowsUndo:")
	public native void setAllowsUndo(boolean flag);

	@Generated
	@Selector("setAutomaticDashSubstitutionEnabled:")
	public native void setAutomaticDashSubstitutionEnabled(boolean flag);

	@Generated
	@Selector("setAutomaticDataDetectionEnabled:")
	public native void setAutomaticDataDetectionEnabled(boolean flag);

	@Generated
	@Selector("setAutomaticLinkDetectionEnabled:")
	public native void setAutomaticLinkDetectionEnabled(boolean flag);

	@Generated
	@Selector("setAutomaticQuoteSubstitutionEnabled:")
	public native void setAutomaticQuoteSubstitutionEnabled(boolean flag);

	@Generated
	@Selector("setAutomaticSpellingCorrectionEnabled:")
	public native void setAutomaticSpellingCorrectionEnabled(boolean flag);

	@Generated
	@Selector("setAutomaticTextReplacementEnabled:")
	public native void setAutomaticTextReplacementEnabled(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBaseWritingDirection:range:")
	public native void setBaseWritingDirectionRange(long writingDirection,
			@ByValue NSRange range);

	@Generated
	@Selector("setConstrainedFrameSize:")
	public native void setConstrainedFrameSize(@ByValue CGSize desiredSize);

	@Generated
	@Selector("setContinuousSpellCheckingEnabled:")
	public native void setContinuousSpellCheckingEnabled(boolean flag);

	@Generated
	@Selector("setDefaultParagraphStyle:")
	public native void setDefaultParagraphStyle(NSParagraphStyle paragraphStyle);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDisplaysLinkToolTips:")
	public native void setDisplaysLinkToolTips(boolean flag);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setEnabledTextCheckingTypes:")
	public native void setEnabledTextCheckingTypes(long checkingTypes);

	@Generated
	@Selector("setFieldEditor:")
	public native void setFieldEditor(boolean flag);

	@Generated
	@Selector("setGrammarCheckingEnabled:")
	public native void setGrammarCheckingEnabled(boolean flag);

	@Generated
	@Selector("setImportsGraphics:")
	public native void setImportsGraphics(boolean flag);

	@Generated
	@Selector("setIncrementalSearchingEnabled:")
	public native void setIncrementalSearchingEnabled(boolean flag);

	@Generated
	@Selector("setInsertionPointColor:")
	public native void setInsertionPointColor(NSColor color);

	@Generated
	@Selector("setLayoutOrientation:")
	public native void setLayoutOrientation(long theOrientation);

	@Generated
	@Selector("setLinkTextAttributes:")
	public native void setLinkTextAttributes(NSDictionary attributeDictionary);

	@Generated
	@Selector("setMarkedText:selectedRange:")
	public native void setMarkedTextSelectedRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange selRange);

	@Generated
	@Selector("setMarkedText:selectedRange:replacementRange:")
	public native void setMarkedTextSelectedRangeReplacementRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange selectedRange, @ByValue NSRange replacementRange);

	@Generated
	@Selector("setMarkedTextAttributes:")
	public native void setMarkedTextAttributes(NSDictionary attributeDictionary);

	@Generated
	@Selector("setNeedsDisplayInRect:avoidAdditionalLayout:")
	public native void setNeedsDisplayInRectAvoidAdditionalLayout(
			@ByValue CGRect rect, boolean flag);

	@Generated
	@Selector("setRichText:")
	public native void setRichText(boolean flag);

	@Generated
	@Selector("setRulerVisible:")
	public native void setRulerVisible(boolean flag);

	@Generated
	@Selector("setSelectable:")
	public native void setSelectable(boolean flag);

	@Generated
	@Selector("setSelectedRange:")
	public native void setSelectedRange(@ByValue NSRange charRange);

	@Generated
	@Selector("setSelectedRange:affinity:stillSelecting:")
	public native void setSelectedRangeAffinityStillSelecting(
			@ByValue NSRange charRange, long affinity,
			boolean stillSelectingFlag);

	@Generated
	@Selector("setSelectedRanges:")
	public native void setSelectedRanges(NSArray ranges);

	@Generated
	@Selector("setSelectedRanges:affinity:stillSelecting:")
	public native void setSelectedRangesAffinityStillSelecting(NSArray ranges,
			long affinity, boolean stillSelectingFlag);

	@Generated
	@Selector("setSelectedTextAttributes:")
	public native void setSelectedTextAttributes(
			NSDictionary attributeDictionary);

	@Generated
	@Selector("setSelectionGranularity:")
	public native void setSelectionGranularity(long granularity);

	@Generated
	@Selector("setSmartInsertDeleteEnabled:")
	public native void setSmartInsertDeleteEnabled(boolean flag);

	@Generated
	@Selector("setSpellingState:range:")
	public native void setSpellingStateRange(long value,
			@ByValue NSRange charRange);

	@Generated
	@Selector("setTextContainer:")
	public native void setTextContainer(NSTextContainer container);

	@Generated
	@Selector("setTextContainerInset:")
	public native void setTextContainerInset(@ByValue CGSize inset);

	@Generated
	@Selector("setTypingAttributes:")
	public native void setTypingAttributes(NSDictionary attrs);

	@Generated
	@Selector("setUsesFindBar:")
	public native void setUsesFindBar(boolean flag);

	@Generated
	@Selector("setUsesFindPanel:")
	public native void setUsesFindPanel(boolean flag);

	@Generated
	@Selector("setUsesFontPanel:")
	public native void setUsesFontPanel(boolean flag);

	@Generated
	@Selector("setUsesInspectorBar:")
	public native void setUsesInspectorBar(boolean flag);

	@Generated
	@Selector("setUsesRuler:")
	public native void setUsesRuler(boolean flag);

	@Generated
	@Selector("shouldChangeTextInRange:replacementString:")
	public native boolean shouldChangeTextInRangeReplacementString(
			@ByValue NSRange affectedCharRange, String replacementString);

	@Generated
	@Selector("shouldChangeTextInRanges:replacementStrings:")
	public native boolean shouldChangeTextInRangesReplacementStrings(
			NSArray affectedRanges, NSArray replacementStrings);

	@Generated
	@Selector("shouldDrawInsertionPoint")
	public native boolean shouldDrawInsertionPoint();

	@Generated
	@Selector("showFindIndicatorForRange:")
	public native void showFindIndicatorForRange(@ByValue NSRange charRange);

	@Generated
	@Selector("smartDeleteRangeForProposedRange:")
	@ByValue
	public native NSRange smartDeleteRangeForProposedRange(
			@ByValue NSRange proposedCharRange);

	@Generated
	@Selector("smartInsertAfterStringForString:replacingRange:")
	public native String smartInsertAfterStringForStringReplacingRange(
			String pasteString, @ByValue NSRange charRangeToReplace);

	@Generated
	@Selector("smartInsertBeforeStringForString:replacingRange:")
	public native String smartInsertBeforeStringForStringReplacingRange(
			String pasteString, @ByValue NSRange charRangeToReplace);

	@Generated
	@Selector("smartInsertDeleteEnabled")
	public native boolean smartInsertDeleteEnabled();

	@Generated
	@Selector("smartInsertForString:replacingRange:beforeString:afterString:")
	public native void smartInsertForStringReplacingRangeBeforeStringAfterString(
			String pasteString, @ByValue NSRange charRangeToReplace,
			Ptr<NSString> beforeString, Ptr<NSString> afterString);

	@Generated
	@Selector("spellCheckerDocumentTag")
	public native long spellCheckerDocumentTag();

	@Generated
	@Selector("startSpeaking:")
	public native void startSpeaking(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("stopSpeaking:")
	public native void stopSpeaking(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("textContainer")
	public native NSTextContainer textContainer();

	@Generated
	@Selector("textContainerInset")
	@ByValue
	public native CGSize textContainerInset();

	@Generated
	@Selector("textContainerOrigin")
	@ByValue
	public native CGPoint textContainerOrigin();

	@Generated
	@Selector("textStorage")
	public native NSTextStorage textStorage();

	@Generated
	@Selector("tightenKerning:")
	public native void tightenKerning(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticDashSubstitution:")
	public native void toggleAutomaticDashSubstitution(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticDataDetection:")
	public native void toggleAutomaticDataDetection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticLinkDetection:")
	public native void toggleAutomaticLinkDetection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticQuoteSubstitution:")
	public native void toggleAutomaticQuoteSubstitution(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticSpellingCorrection:")
	public native void toggleAutomaticSpellingCorrection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleAutomaticTextReplacement:")
	public native void toggleAutomaticTextReplacement(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleBaseWritingDirection:")
	public native void toggleBaseWritingDirection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleContinuousSpellChecking:")
	public native void toggleContinuousSpellChecking(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleGrammarChecking:")
	public native void toggleGrammarChecking(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleQuickLookPreviewPanel:")
	public native void toggleQuickLookPreviewPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleSmartInsertDelete:")
	public native void toggleSmartInsertDelete(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleTraditionalCharacterShape:")
	public native void toggleTraditionalCharacterShape(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("turnOffKerning:")
	public native void turnOffKerning(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("turnOffLigatures:")
	public native void turnOffLigatures(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("typingAttributes")
	public native NSDictionary typingAttributes();

	@Generated
	@Selector("unmarkText")
	public native void unmarkText();

	@Generated
	@Selector("updateDragTypeRegistration")
	public native void updateDragTypeRegistration();

	@Generated
	@Selector("updateFontPanel")
	public native void updateFontPanel();

	@Generated
	@Selector("updateInsertionPointStateAndRestartTimer:")
	public native void updateInsertionPointStateAndRestartTimer(
			boolean restartFlag);

	@Generated
	@Selector("updateQuickLookPreviewPanel")
	public native void updateQuickLookPreviewPanel();

	@Generated
	@Selector("updateRuler")
	public native void updateRuler();

	@Generated
	@Selector("useAllLigatures:")
	public native void useAllLigatures(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("useStandardKerning:")
	public native void useStandardKerning(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("useStandardLigatures:")
	public native void useStandardLigatures(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("usesFindBar")
	public native boolean usesFindBar();

	@Generated
	@Selector("usesFindPanel")
	public native boolean usesFindPanel();

	@Generated
	@Selector("usesFontPanel")
	public native boolean usesFontPanel();

	@Generated
	@Selector("usesInspectorBar")
	public native boolean usesInspectorBar();

	@Generated
	@Selector("usesRuler")
	public native boolean usesRuler();

	@Generated
	@Selector("validAttributesForMarkedText")
	public native NSArray validAttributesForMarkedText();

	@Generated
	@Selector("validRequestorForSendType:returnType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object validRequestorForSendTypeReturnType(String sendType,
			String returnType);

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);

	@Generated
	@IsOptional
	@Selector("windowLevel")
	public native long windowLevel();

	@Generated
	@Selector("writablePasteboardTypes")
	public native NSArray writablePasteboardTypes();

	@Generated
	@Selector("writeSelectionToPasteboard:type:")
	public native boolean writeSelectionToPasteboardType(NSPasteboard pboard,
			String type);

	@Generated
	@Selector("writeSelectionToPasteboard:types:")
	public native boolean writeSelectionToPasteboardTypes(NSPasteboard pboard,
			NSArray types);
}
