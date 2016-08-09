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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableParagraphStyle extends NSParagraphStyle {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableParagraphStyle(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTabStop:")
	public native void addTabStop(NSTextTab anObject);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableParagraphStyle alloc();

	@Generated
	@Selector("init")
	public native NSMutableParagraphStyle init();

	@Generated
	@Selector("removeTabStop:")
	public native void removeTabStop(NSTextTab anObject);

	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(long alignment);

	@Generated
	@Selector("setBaseWritingDirection:")
	public native void setBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setDefaultTabInterval:")
	public native void setDefaultTabInterval(double aFloat);

	@Generated
	@Selector("setFirstLineHeadIndent:")
	public native void setFirstLineHeadIndent(double aFloat);

	@Generated
	@Selector("setHeadIndent:")
	public native void setHeadIndent(double aFloat);

	@Generated
	@Selector("setHeaderLevel:")
	public native void setHeaderLevel(long level);

	@Generated
	@Selector("setHyphenationFactor:")
	public native void setHyphenationFactor(float aFactor);

	@Generated
	@Selector("setLineBreakMode:")
	public native void setLineBreakMode(long mode);

	@Generated
	@Selector("setLineHeightMultiple:")
	public native void setLineHeightMultiple(double aFloat);

	@Generated
	@Selector("setLineSpacing:")
	public native void setLineSpacing(double aFloat);

	@Generated
	@Selector("setMaximumLineHeight:")
	public native void setMaximumLineHeight(double aFloat);

	@Generated
	@Selector("setMinimumLineHeight:")
	public native void setMinimumLineHeight(double aFloat);

	@Generated
	@Selector("setParagraphSpacing:")
	public native void setParagraphSpacing(double aFloat);

	@Generated
	@Selector("setParagraphSpacingBefore:")
	public native void setParagraphSpacingBefore(double aFloat);

	@Generated
	@Selector("setParagraphStyle:")
	public native void setParagraphStyle(NSParagraphStyle obj);

	@Generated
	@Selector("setTabStops:")
	public native void setTabStops(NSArray array);

	@Generated
	@Selector("setTailIndent:")
	public native void setTailIndent(double aFloat);

	@Generated
	@Selector("setTextBlocks:")
	public native void setTextBlocks(NSArray array);

	@Generated
	@Selector("setTextLists:")
	public native void setTextLists(NSArray array);

	@Generated
	@Selector("setTighteningFactorForTruncation:")
	public native void setTighteningFactorForTruncation(float aFactor);
}
