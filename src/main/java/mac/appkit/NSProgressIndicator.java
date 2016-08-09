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
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProgressIndicator extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSProgressIndicator(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSProgressIndicator alloc();

	@Generated
	@Selector("animate:")
	public native void animate(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("animationDelay")
	public native double animationDelay();

	@Generated
	@Selector("controlSize")
	public native long controlSize();

	@Generated
	@Selector("controlTint")
	public native long controlTint();

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("incrementBy:")
	public native void incrementBy(double delta);

	@Generated
	@Selector("init")
	public native NSProgressIndicator init();

	@Generated
	@Selector("initWithFrame:")
	public native NSProgressIndicator initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isBezeled")
	public native boolean isBezeled();

	@Generated
	@Selector("isDisplayedWhenStopped")
	public native boolean isDisplayedWhenStopped();

	@Generated
	@Selector("isIndeterminate")
	public native boolean isIndeterminate();

	@Generated
	@Selector("maxValue")
	public native double maxValue();

	@Generated
	@Selector("minValue")
	public native double minValue();

	@Generated
	@Selector("setAnimationDelay:")
	public native void setAnimationDelay(double delay);

	@Generated
	@Selector("setBezeled:")
	public native void setBezeled(boolean flag);

	@Generated
	@Selector("setControlSize:")
	public native void setControlSize(long size);

	@Generated
	@Selector("setControlTint:")
	public native void setControlTint(long tint);

	@Generated
	@Selector("setDisplayedWhenStopped:")
	public native void setDisplayedWhenStopped(boolean isDisplayed);

	@Generated
	@Selector("setDoubleValue:")
	public native void setDoubleValue(double doubleValue);

	@Generated
	@Selector("setIndeterminate:")
	public native void setIndeterminate(boolean flag);

	@Generated
	@Selector("setMaxValue:")
	public native void setMaxValue(double newMaximum);

	@Generated
	@Selector("setMinValue:")
	public native void setMinValue(double newMinimum);

	@Generated
	@Selector("setStyle:")
	public native void setStyle(long style);

	@Generated
	@Selector("setUsesThreadedAnimation:")
	public native void setUsesThreadedAnimation(boolean threadedAnimation);

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("startAnimation:")
	public native void startAnimation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("stopAnimation:")
	public native void stopAnimation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("style")
	public native long style();

	@Generated
	@Selector("usesThreadedAnimation")
	public native boolean usesThreadedAnimation();
}
