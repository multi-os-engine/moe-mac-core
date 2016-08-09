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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextAttachmentCell extends NSCell implements
		mac.appkit.protocol.NSTextAttachmentCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextAttachmentCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextAttachmentCell alloc();

	@Generated
	@Selector("attachment")
	public native NSTextAttachment attachment();

	@Generated
	@Selector("cellBaselineOffset")
	@ByValue
	public native CGPoint cellBaselineOffset();

	@Generated
	@Selector("cellFrameForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
	@ByValue
	public native CGRect cellFrameForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
			NSTextContainer textContainer, @ByValue CGRect lineFrag,
			@ByValue CGPoint position, long charIndex);

	@Generated
	@Selector("cellSize")
	@ByValue
	public native CGSize cellSize();

	@Generated
	@Selector("drawWithFrame:inView:")
	public native void drawWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawWithFrame:inView:characterIndex:")
	public native void drawWithFrameInViewCharacterIndex(
			@ByValue CGRect cellFrame, NSView controlView, long charIndex);

	@Generated
	@Selector("drawWithFrame:inView:characterIndex:layoutManager:")
	public native void drawWithFrameInViewCharacterIndexLayoutManager(
			@ByValue CGRect cellFrame, NSView controlView, long charIndex,
			NSLayoutManager layoutManager);

	@Generated
	@Selector("highlight:withFrame:inView:")
	public native void highlightWithFrameInView(boolean flag,
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("init")
	public native NSTextAttachmentCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSTextAttachmentCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSTextAttachmentCell initTextCell(String aString);

	@Generated
	@Selector("setAttachment:")
	public native void setAttachment(NSTextAttachment anObject);

	@Generated
	@Selector("trackMouse:inRect:ofView:atCharacterIndex:untilMouseUp:")
	public native boolean trackMouseInRectOfViewAtCharacterIndexUntilMouseUp(
			NSEvent theEvent, @ByValue CGRect cellFrame, NSView controlView,
			long charIndex, boolean flag);

	@Generated
	@Selector("trackMouse:inRect:ofView:untilMouseUp:")
	public native boolean trackMouseInRectOfViewUntilMouseUp(NSEvent theEvent,
			@ByValue CGRect cellFrame, NSView controlView, boolean flag);

	@Generated
	@Selector("wantsToTrackMouse")
	public native boolean wantsToTrackMouse();

	@Generated
	@Selector("wantsToTrackMouseForEvent:inRect:ofView:atCharacterIndex:")
	public native boolean wantsToTrackMouseForEventInRectOfViewAtCharacterIndex(
			NSEvent theEvent, @ByValue CGRect cellFrame, NSView controlView,
			long charIndex);
}
