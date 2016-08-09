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
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTableHeaderCell extends NSTextFieldCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableHeaderCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableHeaderCell alloc();

	@Generated
	@Selector("drawSortIndicatorWithFrame:inView:ascending:priority:")
	public native void drawSortIndicatorWithFrameInViewAscendingPriority(
			@ByValue CGRect cellFrame, NSView controlView, boolean ascending,
			long priority);

	@Generated
	@Selector("init")
	public native NSTableHeaderCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSTableHeaderCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSTableHeaderCell initTextCell(String aString);

	@Generated
	@Selector("sortIndicatorRectForBounds:")
	@ByValue
	public native CGRect sortIndicatorRectForBounds(@ByValue CGRect theRect);
}
