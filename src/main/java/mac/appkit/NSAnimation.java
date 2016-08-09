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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAnimation extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAnimation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addProgressMark:")
	public native void addProgressMark(float progressMark);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAnimation alloc();

	@Generated
	@Selector("animationBlockingMode")
	public native long animationBlockingMode();

	@Generated
	@Selector("animationCurve")
	public native long animationCurve();

	@Generated
	@Selector("clearStartAnimation")
	public native void clearStartAnimation();

	@Generated
	@Selector("clearStopAnimation")
	public native void clearStopAnimation();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentProgress")
	public native float currentProgress();

	@Generated
	@Selector("currentValue")
	public native float currentValue();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("frameRate")
	public native float frameRate();

	@Generated
	@Selector("init")
	public native NSAnimation init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDuration:animationCurve:")
	public native NSAnimation initWithDurationAnimationCurve(double duration,
			long animationCurve);

	@Generated
	@Selector("isAnimating")
	public native boolean isAnimating();

	@Generated
	@Selector("progressMarks")
	public native NSArray progressMarks();

	@Generated
	@Selector("removeProgressMark:")
	public native void removeProgressMark(float progressMark);

	@Generated
	@Selector("runLoopModesForAnimating")
	public native NSArray runLoopModesForAnimating();

	@Generated
	@Selector("setAnimationBlockingMode:")
	public native void setAnimationBlockingMode(long animationBlockingMode);

	@Generated
	@Selector("setAnimationCurve:")
	public native void setAnimationCurve(long curve);

	@Generated
	@Selector("setCurrentProgress:")
	public native void setCurrentProgress(float progress);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDuration:")
	public native void setDuration(double duration);

	@Generated
	@Selector("setFrameRate:")
	public native void setFrameRate(float framesPerSecond);

	@Generated
	@Selector("setProgressMarks:")
	public native void setProgressMarks(NSArray progressMarks);

	@Generated
	@Selector("startAnimation")
	public native void startAnimation();

	@Generated
	@Selector("startWhenAnimation:reachesProgress:")
	public native void startWhenAnimationReachesProgress(NSAnimation animation,
			float startProgress);

	@Generated
	@Selector("stopAnimation")
	public native void stopAnimation();

	@Generated
	@Selector("stopWhenAnimation:reachesProgress:")
	public native void stopWhenAnimationReachesProgress(NSAnimation animation,
			float stopProgress);
}
