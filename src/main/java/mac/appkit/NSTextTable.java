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
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextTable extends NSTextBlock {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextTable(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextTable alloc();

	@Generated
	@Selector("boundsRectForBlock:contentRect:inRect:textContainer:characterRange:")
	@ByValue
	public native CGRect boundsRectForBlockContentRectInRectTextContainerCharacterRange(
			NSTextTableBlock block, @ByValue CGRect contentRect,
			@ByValue CGRect rect, NSTextContainer textContainer,
			@ByValue NSRange charRange);

	@Generated
	@Selector("collapsesBorders")
	public native boolean collapsesBorders();

	@Generated
	@Selector("drawBackgroundForBlock:withFrame:inView:characterRange:layoutManager:")
	public native void drawBackgroundForBlockWithFrameInViewCharacterRangeLayoutManager(
			NSTextTableBlock block, @ByValue CGRect frameRect,
			NSView controlView, @ByValue NSRange charRange,
			NSLayoutManager layoutManager);

	@Generated
	@Selector("hidesEmptyCells")
	public native boolean hidesEmptyCells();

	@Generated
	@Selector("init")
	public native NSTextTable init();

	@Generated
	@Selector("layoutAlgorithm")
	public native long layoutAlgorithm();

	@Generated
	@Selector("numberOfColumns")
	public native long numberOfColumns();

	@Generated
	@Selector("rectForBlock:layoutAtPoint:inRect:textContainer:characterRange:")
	@ByValue
	public native CGRect rectForBlockLayoutAtPointInRectTextContainerCharacterRange(
			NSTextTableBlock block, @ByValue CGPoint startingPoint,
			@ByValue CGRect rect, NSTextContainer textContainer,
			@ByValue NSRange charRange);

	@Generated
	@Selector("setCollapsesBorders:")
	public native void setCollapsesBorders(boolean flag);

	@Generated
	@Selector("setHidesEmptyCells:")
	public native void setHidesEmptyCells(boolean flag);

	@Generated
	@Selector("setLayoutAlgorithm:")
	public native void setLayoutAlgorithm(long algorithm);

	@Generated
	@Selector("setNumberOfColumns:")
	public native void setNumberOfColumns(long numCols);
}
