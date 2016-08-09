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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProgress extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSProgress(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSProgress alloc();

	@Generated
	@Selector("becomeCurrentWithPendingUnitCount:")
	public native void becomeCurrentWithPendingUnitCount(long unitCount);

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("completedUnitCount")
	public native long completedUnitCount();

	@Generated
	@Selector("currentProgress")
	public static native NSProgress currentProgress();

	@Generated
	@Selector("fractionCompleted")
	public native double fractionCompleted();

	@Generated
	@Selector("init")
	public native NSProgress init();

	@Generated
	@Selector("initWithParent:userInfo:")
	public native NSProgress initWithParentUserInfo(
			NSProgress parentProgressOrNil, NSDictionary userInfoOrNil);

	@Generated
	@Selector("isCancellable")
	public native boolean isCancellable();

	@Generated
	@Selector("isCancelled")
	public native boolean isCancelled();

	@Generated
	@Selector("isIndeterminate")
	public native boolean isIndeterminate();

	@Generated
	@Selector("isOld")
	public native boolean isOld();

	@Generated
	@Selector("isPausable")
	public native boolean isPausable();

	@Generated
	@Selector("isPaused")
	public native boolean isPaused();

	@Generated
	@Selector("kind")
	public native String kind();

	@Generated
	@Selector("localizedAdditionalDescription")
	public native String localizedAdditionalDescription();

	@Generated
	@Selector("localizedDescription")
	public native String localizedDescription();

	@Generated
	@Selector("pause")
	public native void pause();

	@Generated
	@Selector("progressWithTotalUnitCount:")
	public static native NSProgress progressWithTotalUnitCount(long unitCount);

	@Generated
	@Selector("publish")
	public native void publish();

	@Generated
	@Selector("removeSubscriber:")
	public static native void removeSubscriber(
			@Mapped(ObjCObjectMapper.class) Object subscriber);

	@Generated
	@Selector("resignCurrent")
	public native void resignCurrent();

	@Generated
	@Selector("setCancellable:")
	public native void setCancellable(boolean value);

	@Generated
	@Selector("setCancellationHandler:")
	public native void setCancellationHandler(
			@ObjCBlock(name = "call_setCancellationHandler") Block_setCancellationHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setCancellationHandler {
		@Generated
		public void call_setCancellationHandler();
	}

	@Generated
	@Selector("setCompletedUnitCount:")
	public native void setCompletedUnitCount(long value);

	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	@Generated
	@Selector("setLocalizedAdditionalDescription:")
	public native void setLocalizedAdditionalDescription(String value);

	@Generated
	@Selector("setLocalizedDescription:")
	public native void setLocalizedDescription(String value);

	@Generated
	@Selector("setPausable:")
	public native void setPausable(boolean value);

	@Generated
	@Selector("setPausingHandler:")
	public native void setPausingHandler(
			@ObjCBlock(name = "call_setPausingHandler") Block_setPausingHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setPausingHandler {
		@Generated
		public void call_setPausingHandler();
	}

	@Generated
	@Selector("setTotalUnitCount:")
	public native void setTotalUnitCount(long value);

	@Generated
	@Selector("setUserInfoObject:forKey:")
	public native void setUserInfoObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objectOrNil, String key);

	@Generated
	@Selector("totalUnitCount")
	public native long totalUnitCount();

	@Generated
	@Selector("unpublish")
	public native void unpublish();

	@Generated
	@Selector("userInfo")
	public native NSDictionary userInfo();
}
