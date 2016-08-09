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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSError;
import mac.foundation.NSUndoManager;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSResponder extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSResponder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstResponder")
	public native boolean acceptsFirstResponder();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSResponder alloc();

	@Generated
	@Selector("becomeFirstResponder")
	public native boolean becomeFirstResponder();

	@Generated
	@Selector("beginGestureWithEvent:")
	public native void beginGestureWithEvent(NSEvent event);

	@Generated
	@Selector("cancelOperation:")
	public native void cancelOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("capitalizeWord:")
	public native void capitalizeWord(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("centerSelectionInVisibleArea:")
	public native void centerSelectionInVisibleArea(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeCaseOfLetter:")
	public native void changeCaseOfLetter(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("complete:")
	public native void complete(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("cursorUpdate:")
	public native void cursorUpdate(NSEvent event);

	@Generated
	@Selector("deleteBackward:")
	public native void deleteBackward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteBackwardByDecomposingPreviousCharacter:")
	public native void deleteBackwardByDecomposingPreviousCharacter(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteForward:")
	public native void deleteForward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteToBeginningOfLine:")
	public native void deleteToBeginningOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteToBeginningOfParagraph:")
	public native void deleteToBeginningOfParagraph(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteToEndOfLine:")
	public native void deleteToEndOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteToEndOfParagraph:")
	public native void deleteToEndOfParagraph(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteToMark:")
	public native void deleteToMark(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteWordBackward:")
	public native void deleteWordBackward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deleteWordForward:")
	public native void deleteWordForward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("doCommandBySelector:")
	public native void doCommandBySelector(SEL aSelector);

	@Generated
	@Selector("encodeRestorableStateWithCoder:")
	public native void encodeRestorableStateWithCoder(NSCoder coder);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("endGestureWithEvent:")
	public native void endGestureWithEvent(NSEvent event);

	@Generated
	@Selector("flagsChanged:")
	public native void flagsChanged(NSEvent theEvent);

	@Generated
	@Selector("flushBufferedKeyEvents")
	public native void flushBufferedKeyEvents();

	@Generated
	@Selector("helpRequested:")
	public native void helpRequested(NSEvent eventPtr);

	@Generated
	@Selector("indent:")
	public native void indent(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("init")
	public native NSResponder init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("insertBacktab:")
	public native void insertBacktab(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertContainerBreak:")
	public native void insertContainerBreak(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertDoubleQuoteIgnoringSubstitution:")
	public native void insertDoubleQuoteIgnoringSubstitution(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertLineBreak:")
	public native void insertLineBreak(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertNewline:")
	public native void insertNewline(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertNewlineIgnoringFieldEditor:")
	public native void insertNewlineIgnoringFieldEditor(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertParagraphSeparator:")
	public native void insertParagraphSeparator(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertSingleQuoteIgnoringSubstitution:")
	public native void insertSingleQuoteIgnoringSubstitution(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertTab:")
	public native void insertTab(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertTabIgnoringFieldEditor:")
	public native void insertTabIgnoringFieldEditor(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertText:")
	public native void insertText(
			@Mapped(ObjCObjectMapper.class) Object insertString);

	@Generated
	@Selector("interfaceStyle")
	public native long interfaceStyle();

	@Generated
	@Selector("interpretKeyEvents:")
	public native void interpretKeyEvents(NSArray eventArray);

	@Generated
	@Selector("invalidateRestorableState")
	public native void invalidateRestorableState();

	@Generated
	@Selector("keyDown:")
	public native void keyDown(NSEvent theEvent);

	@Generated
	@Selector("keyUp:")
	public native void keyUp(NSEvent theEvent);

	@Generated
	@Selector("lowercaseWord:")
	public native void lowercaseWord(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("magnifyWithEvent:")
	public native void magnifyWithEvent(NSEvent event);

	@Generated
	@Selector("makeBaseWritingDirectionLeftToRight:")
	public native void makeBaseWritingDirectionLeftToRight(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeBaseWritingDirectionNatural:")
	public native void makeBaseWritingDirectionNatural(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeBaseWritingDirectionRightToLeft:")
	public native void makeBaseWritingDirectionRightToLeft(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeTextWritingDirectionLeftToRight:")
	public native void makeTextWritingDirectionLeftToRight(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeTextWritingDirectionNatural:")
	public native void makeTextWritingDirectionNatural(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeTextWritingDirectionRightToLeft:")
	public native void makeTextWritingDirectionRightToLeft(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("mouseDown:")
	public native void mouseDown(NSEvent theEvent);

	@Generated
	@Selector("mouseDragged:")
	public native void mouseDragged(NSEvent theEvent);

	@Generated
	@Selector("mouseEntered:")
	public native void mouseEntered(NSEvent theEvent);

	@Generated
	@Selector("mouseExited:")
	public native void mouseExited(NSEvent theEvent);

	@Generated
	@Selector("mouseMoved:")
	public native void mouseMoved(NSEvent theEvent);

	@Generated
	@Selector("mouseUp:")
	public native void mouseUp(NSEvent theEvent);

	@Generated
	@Selector("moveBackward:")
	public native void moveBackward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveBackwardAndModifySelection:")
	public native void moveBackwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveDown:")
	public native void moveDown(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveDownAndModifySelection:")
	public native void moveDownAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveForward:")
	public native void moveForward(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveForwardAndModifySelection:")
	public native void moveForwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveLeft:")
	public native void moveLeft(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveLeftAndModifySelection:")
	public native void moveLeftAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveParagraphBackwardAndModifySelection:")
	public native void moveParagraphBackwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveParagraphForwardAndModifySelection:")
	public native void moveParagraphForwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveRight:")
	public native void moveRight(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveRightAndModifySelection:")
	public native void moveRightAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfDocument:")
	public native void moveToBeginningOfDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfDocumentAndModifySelection:")
	public native void moveToBeginningOfDocumentAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfLine:")
	public native void moveToBeginningOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfLineAndModifySelection:")
	public native void moveToBeginningOfLineAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfParagraph:")
	public native void moveToBeginningOfParagraph(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToBeginningOfParagraphAndModifySelection:")
	public native void moveToBeginningOfParagraphAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfDocument:")
	public native void moveToEndOfDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfDocumentAndModifySelection:")
	public native void moveToEndOfDocumentAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfLine:")
	public native void moveToEndOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfLineAndModifySelection:")
	public native void moveToEndOfLineAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfParagraph:")
	public native void moveToEndOfParagraph(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToEndOfParagraphAndModifySelection:")
	public native void moveToEndOfParagraphAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToLeftEndOfLine:")
	public native void moveToLeftEndOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToLeftEndOfLineAndModifySelection:")
	public native void moveToLeftEndOfLineAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToRightEndOfLine:")
	public native void moveToRightEndOfLine(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveToRightEndOfLineAndModifySelection:")
	public native void moveToRightEndOfLineAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveUp:")
	public native void moveUp(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveUpAndModifySelection:")
	public native void moveUpAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordBackward:")
	public native void moveWordBackward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordBackwardAndModifySelection:")
	public native void moveWordBackwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordForward:")
	public native void moveWordForward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordForwardAndModifySelection:")
	public native void moveWordForwardAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordLeft:")
	public native void moveWordLeft(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordLeftAndModifySelection:")
	public native void moveWordLeftAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordRight:")
	public native void moveWordRight(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveWordRightAndModifySelection:")
	public native void moveWordRightAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("nextResponder")
	public native NSResponder nextResponder();

	@Generated
	@Selector("noResponderFor:")
	public native void noResponderFor(SEL eventSelector);

	@Generated
	@Selector("otherMouseDown:")
	public native void otherMouseDown(NSEvent theEvent);

	@Generated
	@Selector("otherMouseDragged:")
	public native void otherMouseDragged(NSEvent theEvent);

	@Generated
	@Selector("otherMouseUp:")
	public native void otherMouseUp(NSEvent theEvent);

	@Generated
	@Selector("pageDown:")
	public native void pageDown(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pageDownAndModifySelection:")
	public native void pageDownAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pageUp:")
	public native void pageUp(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pageUpAndModifySelection:")
	public native void pageUpAndModifySelection(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("performKeyEquivalent:")
	public native boolean performKeyEquivalent(NSEvent theEvent);

	@Generated
	@Selector("performMnemonic:")
	public native boolean performMnemonic(String theString);

	@Generated
	@Selector("performTextFinderAction:")
	public native void performTextFinderAction(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("presentError:")
	public native boolean presentError(NSError error);

	@Generated
	@Selector("presentError:modalForWindow:delegate:didPresentSelector:contextInfo:")
	public native void presentErrorModalForWindowDelegateDidPresentSelectorContextInfo(
			NSError error, NSWindow window,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didPresentSelector, VoidPtr contextInfo);

	@Generated
	@Selector("quickLookPreviewItems:")
	public native void quickLookPreviewItems(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("quickLookWithEvent:")
	public native void quickLookWithEvent(NSEvent event);

	@Generated
	@Selector("resignFirstResponder")
	public native boolean resignFirstResponder();

	@Generated
	@Selector("restorableStateKeyPaths")
	public static native NSArray restorableStateKeyPaths();

	@Generated
	@Selector("restoreStateWithCoder:")
	public native void restoreStateWithCoder(NSCoder coder);

	@Generated
	@Selector("rightMouseDown:")
	public native void rightMouseDown(NSEvent theEvent);

	@Generated
	@Selector("rightMouseDragged:")
	public native void rightMouseDragged(NSEvent theEvent);

	@Generated
	@Selector("rightMouseUp:")
	public native void rightMouseUp(NSEvent theEvent);

	@Generated
	@Selector("rotateWithEvent:")
	public native void rotateWithEvent(NSEvent event);

	@Generated
	@Selector("scrollLineDown:")
	public native void scrollLineDown(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollLineUp:")
	public native void scrollLineUp(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollPageDown:")
	public native void scrollPageDown(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollPageUp:")
	public native void scrollPageUp(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollToBeginningOfDocument:")
	public native void scrollToBeginningOfDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollToEndOfDocument:")
	public native void scrollToEndOfDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("scrollWheel:")
	public native void scrollWheel(NSEvent theEvent);

	@Generated
	@Selector("selectAll:")
	public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectLine:")
	public native void selectLine(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectParagraph:")
	public native void selectParagraph(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectToMark:")
	public native void selectToMark(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectWord:")
	public native void selectWord(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setInterfaceStyle:")
	public native void setInterfaceStyle(long interfaceStyle);

	@Generated
	@Selector("setMark:")
	public native void setMark(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu menu);

	@Generated
	@Selector("setNextResponder:")
	public native void setNextResponder(NSResponder aResponder);

	@Generated
	@Selector("shouldBeTreatedAsInkEvent:")
	public native boolean shouldBeTreatedAsInkEvent(NSEvent theEvent);

	@Generated
	@Selector("showContextHelp:")
	public native void showContextHelp(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("smartMagnifyWithEvent:")
	public native void smartMagnifyWithEvent(NSEvent event);

	@Generated
	@Selector("supplementalTargetForAction:sender:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object supplementalTargetForActionSender(SEL action,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("swapWithMark:")
	public native void swapWithMark(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("swipeWithEvent:")
	public native void swipeWithEvent(NSEvent event);

	@Generated
	@Selector("tabletPoint:")
	public native void tabletPoint(NSEvent theEvent);

	@Generated
	@Selector("tabletProximity:")
	public native void tabletProximity(NSEvent theEvent);

	@Generated
	@Selector("touchesBeganWithEvent:")
	public native void touchesBeganWithEvent(NSEvent event);

	@Generated
	@Selector("touchesCancelledWithEvent:")
	public native void touchesCancelledWithEvent(NSEvent event);

	@Generated
	@Selector("touchesEndedWithEvent:")
	public native void touchesEndedWithEvent(NSEvent event);

	@Generated
	@Selector("touchesMovedWithEvent:")
	public native void touchesMovedWithEvent(NSEvent event);

	@Generated
	@Selector("transpose:")
	public native void transpose(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("transposeWords:")
	public native void transposeWords(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("tryToPerform:with:")
	public native boolean tryToPerformWith(SEL anAction,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("undoManager")
	public native NSUndoManager undoManager();

	@Generated
	@Selector("uppercaseWord:")
	public native void uppercaseWord(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("validRequestorForSendType:returnType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object validRequestorForSendTypeReturnType(String sendType,
			String returnType);

	@Generated
	@Selector("validateProposedFirstResponder:forEvent:")
	public native boolean validateProposedFirstResponderForEvent(
			NSResponder responder, NSEvent event);

	@Generated
	@Selector("wantsForwardedScrollEventsForAxis:")
	public native boolean wantsForwardedScrollEventsForAxis(long axis);

	@Generated
	@Selector("wantsScrollEventsForSwipeTrackingOnAxis:")
	public native boolean wantsScrollEventsForSwipeTrackingOnAxis(long axis);

	@Generated
	@Selector("willPresentError:")
	public native NSError willPresentError(NSError error);

	@Generated
	@Selector("yank:")
	public native void yank(@Mapped(ObjCObjectMapper.class) Object sender);
}
