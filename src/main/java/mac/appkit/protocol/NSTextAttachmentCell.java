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

package mac.appkit.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.appkit.*;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextAttachmentCell")
public interface NSTextAttachmentCell {
	@Generated
	@Selector("attachment")
	public NSTextAttachment attachment();

	@Generated
	@Selector("cellBaselineOffset")
	@ByValue
	public CGPoint cellBaselineOffset();

	@Generated
	@Selector("cellFrameForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
	@ByValue
	public CGRect cellFrameForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
			NSTextContainer textContainer, @ByValue CGRect lineFrag,
			@ByValue CGPoint position, long charIndex);

	@Generated
	@Selector("cellSize")
	@ByValue
	public CGSize cellSize();

	@Generated
	@Selector("drawWithFrame:inView:")
	public void drawWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawWithFrame:inView:characterIndex:")
	public void drawWithFrameInViewCharacterIndex(@ByValue CGRect cellFrame,
			NSView controlView, long charIndex);

	@Generated
	@Selector("drawWithFrame:inView:characterIndex:layoutManager:")
	public void drawWithFrameInViewCharacterIndexLayoutManager(
			@ByValue CGRect cellFrame, NSView controlView, long charIndex,
			NSLayoutManager layoutManager);

	@Generated
	@Selector("highlight:withFrame:inView:")
	public void highlightWithFrameInView(boolean flag,
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("setAttachment:")
	public void setAttachment(NSTextAttachment anObject);

	@Generated
	@Selector("trackMouse:inRect:ofView:atCharacterIndex:untilMouseUp:")
	public boolean trackMouseInRectOfViewAtCharacterIndexUntilMouseUp(
			NSEvent theEvent, @ByValue CGRect cellFrame, NSView controlView,
			long charIndex, boolean flag);

	@Generated
	@Selector("trackMouse:inRect:ofView:untilMouseUp:")
	public boolean trackMouseInRectOfViewUntilMouseUp(NSEvent theEvent,
			@ByValue CGRect cellFrame, NSView controlView, boolean flag);

	@Generated
	@Selector("wantsToTrackMouse")
	public boolean wantsToTrackMouse();

	@Generated
	@Selector("wantsToTrackMouseForEvent:inRect:ofView:atCharacterIndex:")
	public boolean wantsToTrackMouseForEventInRectOfViewAtCharacterIndex(
			NSEvent theEvent, @ByValue CGRect cellFrame, NSView controlView,
			long charIndex);
}
