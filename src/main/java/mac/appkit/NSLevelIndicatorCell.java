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
public class NSLevelIndicatorCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLevelIndicatorCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLevelIndicatorCell alloc();

	@Generated
	@Selector("criticalValue")
	public native double criticalValue();

	@Generated
	@Selector("init")
	public native NSLevelIndicatorCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSLevelIndicatorCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSLevelIndicatorCell initTextCell(String aString);

	@Generated
	@Selector("initWithLevelIndicatorStyle:")
	public native NSLevelIndicatorCell initWithLevelIndicatorStyle(
			long levelIndicatorStyle);

	@Generated
	@Selector("levelIndicatorStyle")
	public native long levelIndicatorStyle();

	@Generated
	@Selector("maxValue")
	public native double maxValue();

	@Generated
	@Selector("minValue")
	public native double minValue();

	@Generated
	@Selector("numberOfMajorTickMarks")
	public native long numberOfMajorTickMarks();

	@Generated
	@Selector("numberOfTickMarks")
	public native long numberOfTickMarks();

	@Generated
	@Selector("rectOfTickMarkAtIndex:")
	@ByValue
	public native CGRect rectOfTickMarkAtIndex(long index);

	@Generated
	@Selector("setCriticalValue:")
	public native void setCriticalValue(double criticalValue);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setLevelIndicatorStyle:")
	public native void setLevelIndicatorStyle(long levelIndicatorStyle);

	@Generated
	@Selector("setMaxValue:")
	public native void setMaxValue(double maxValue);

	@Generated
	@Selector("setMinValue:")
	public native void setMinValue(double minValue);

	@Generated
	@Selector("setNumberOfMajorTickMarks:")
	public native void setNumberOfMajorTickMarks(long count);

	@Generated
	@Selector("setNumberOfTickMarks:")
	public native void setNumberOfTickMarks(long count);

	@Generated
	@Selector("setTickMarkPosition:")
	public native void setTickMarkPosition(long position);

	@Generated
	@Selector("setWarningValue:")
	public native void setWarningValue(double warningValue);

	@Generated
	@Selector("tickMarkPosition")
	public native long tickMarkPosition();

	@Generated
	@Selector("tickMarkValueAtIndex:")
	public native double tickMarkValueAtIndex(long index);

	@Generated
	@Selector("warningValue")
	public native double warningValue();
}
