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
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSDate;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRunningApplication extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRunningApplication(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("activateWithOptions:")
	public native boolean activateWithOptions(long options);

	@Generated
	@Selector("activationPolicy")
	public native long activationPolicy();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRunningApplication alloc();

	@Generated
	@Selector("bundleIdentifier")
	public native String bundleIdentifier();

	@Generated
	@Selector("bundleURL")
	public native NSURL bundleURL();

	@Generated
	@Selector("currentApplication")
	public static native NSRunningApplication currentApplication();

	@Generated
	@Selector("executableArchitecture")
	public native long executableArchitecture();

	@Generated
	@Selector("executableURL")
	public native NSURL executableURL();

	@Generated
	@Selector("forceTerminate")
	public native boolean forceTerminate();

	@Generated
	@Selector("hide")
	public native boolean hide();

	@Generated
	@Selector("icon")
	public native NSImage icon();

	@Generated
	@Selector("init")
	public native NSRunningApplication init();

	@Generated
	@Selector("isActive")
	public native boolean isActive();

	@Generated
	@Selector("isFinishedLaunching")
	public native boolean isFinishedLaunching();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isTerminated")
	public native boolean isTerminated();

	@Generated
	@Selector("launchDate")
	public native NSDate launchDate();

	@Generated
	@Selector("localizedName")
	public native String localizedName();

	@Generated
	@Selector("ownsMenuBar")
	public native boolean ownsMenuBar();

	@Generated
	@Selector("processIdentifier")
	public native int processIdentifier();

	@Generated
	@Selector("runningApplicationWithProcessIdentifier:")
	public static native NSRunningApplication runningApplicationWithProcessIdentifier(
			int pid);

	@Generated
	@Selector("runningApplicationsWithBundleIdentifier:")
	public static native NSArray runningApplicationsWithBundleIdentifier(
			String bundleIdentifier);

	@Generated
	@Selector("terminate")
	public native boolean terminate();

	@Generated
	@Selector("terminateAutomaticallyTerminableApplications")
	public static native void terminateAutomaticallyTerminableApplications();

	@Generated
	@Selector("unhide")
	public native boolean unhide();
}
