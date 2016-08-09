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

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStepperCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSStepperCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSStepperCell alloc();

	@Generated
	@Selector("autorepeat")
	public native boolean autorepeat();

	@Generated
	@Selector("increment")
	public native double increment();

	@Generated
	@Selector("init")
	public native NSStepperCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSStepperCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSStepperCell initTextCell(String aString);

	@Generated
	@Selector("maxValue")
	public native double maxValue();

	@Generated
	@Selector("minValue")
	public native double minValue();

	@Generated
	@Selector("setAutorepeat:")
	public native void setAutorepeat(boolean autorepeat);

	@Generated
	@Selector("setIncrement:")
	public native void setIncrement(double increment);

	@Generated
	@Selector("setMaxValue:")
	public native void setMaxValue(double maxValue);

	@Generated
	@Selector("setMinValue:")
	public native void setMinValue(double minValue);

	@Generated
	@Selector("setValueWraps:")
	public native void setValueWraps(boolean valueWraps);

	@Generated
	@Selector("valueWraps")
	public native boolean valueWraps();
}
