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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSError;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSpeechSynthesizer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSpeechSynthesizer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addSpeechDictionary:")
	public native void addSpeechDictionary(NSDictionary speechDictionary);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSpeechSynthesizer alloc();

	@Generated
	@Selector("attributesForVoice:")
	public static native NSDictionary attributesForVoice(String voice);

	@Generated
	@Selector("availableVoices")
	public static native NSArray availableVoices();

	@Generated
	@Selector("continueSpeaking")
	public native void continueSpeaking();

	@Generated
	@Selector("defaultVoice")
	public static native String defaultVoice();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native NSSpeechSynthesizer init();

	@Generated
	@Selector("initWithVoice:")
	public native NSSpeechSynthesizer initWithVoice(String voice);

	@Generated
	@Selector("isAnyApplicationSpeaking")
	public static native boolean isAnyApplicationSpeaking();

	@Generated
	@Selector("isSpeaking")
	public native boolean isSpeaking();

	@Generated
	@Selector("objectForProperty:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForPropertyError(String property,
			Ptr<NSError> outError);

	@Generated
	@Selector("pauseSpeakingAtBoundary:")
	public native void pauseSpeakingAtBoundary(long boundary);

	@Generated
	@Selector("phonemesFromText:")
	public native String phonemesFromText(String text);

	@Generated
	@Selector("rate")
	public native float rate();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setObject:forProperty:error:")
	public native boolean setObjectForPropertyError(
			@Mapped(ObjCObjectMapper.class) Object object, String property,
			Ptr<NSError> outError);

	@Generated
	@Selector("setRate:")
	public native void setRate(float rate);

	@Generated
	@Selector("setUsesFeedbackWindow:")
	public native void setUsesFeedbackWindow(boolean flag);

	@Generated
	@Selector("setVoice:")
	public native boolean setVoice(String voice);

	@Generated
	@Selector("setVolume:")
	public native void setVolume(float volume);

	@Generated
	@Selector("startSpeakingString:")
	public native boolean startSpeakingString(String string);

	@Generated
	@Selector("startSpeakingString:toURL:")
	public native boolean startSpeakingStringToURL(String string, NSURL url);

	@Generated
	@Selector("stopSpeaking")
	public native void stopSpeaking();

	@Generated
	@Selector("stopSpeakingAtBoundary:")
	public native void stopSpeakingAtBoundary(long boundary);

	@Generated
	@Selector("usesFeedbackWindow")
	public native boolean usesFeedbackWindow();

	@Generated
	@Selector("voice")
	public native String voice();

	@Generated
	@Selector("volume")
	public native float volume();
}
