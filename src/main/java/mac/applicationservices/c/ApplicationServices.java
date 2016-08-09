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

package mac.applicationservices.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import mac.applicationservices.opaque.*;
import mac.applicationservices.struct.*;
import mac.corefoundation.opaque.*;
import mac.coreservices.opaque.IconRef;
import mac.coreservices.struct.IconFamilyResource;
import mac.struct.NumVersion;
import mac.struct.VersRec;

@Generated
@Library("ApplicationServices")
@Runtime(CRuntime.class)
public final class ApplicationServices {
	static {
		NatJ.register();
	}

	@Generated
	private ApplicationServices() {
	}

	@Generated
	@CFunction
	public static native long ColorSyncProfileGetTypeID();

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreate(
			CFDataRef data, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreateWithURL(
			CFURLRef url, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreateWithName(
			CFStringRef name);

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreateWithDisplayID(
			int displayID);

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreateDeviceProfile(
			CFStringRef deviceClass, CFUUIDRef deviceID, ConstVoidPtr profileID);

	@Generated
	@CFunction
	public static native ColorSyncMutableProfileRef ColorSyncProfileCreateMutable();

	@Generated
	@CFunction
	public static native ColorSyncMutableProfileRef ColorSyncProfileCreateMutableCopy(
			ColorSyncProfileRef prof);

	@Generated
	@CFunction
	public static native ColorSyncProfileRef ColorSyncProfileCreateLink(
			CFArrayRef profileInfo, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native boolean ColorSyncProfileVerify(
			ColorSyncProfileRef prof, Ptr<CFErrorRef> errors,
			Ptr<CFErrorRef> warnings);

	@Generated
	@CFunction
	public static native float ColorSyncProfileEstimateGammaWithDisplayID(
			int displayID, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native float ColorSyncProfileEstimateGamma(
			ColorSyncProfileRef prof, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	@ByValue
	public static native ColorSyncMD5 ColorSyncProfileGetMD5(
			ColorSyncProfileRef prof);

	@Generated
	@CFunction
	public static native CFDataRef ColorSyncProfileCopyData(
			ColorSyncProfileRef prof, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native CFURLRef ColorSyncProfileGetURL(
			ColorSyncProfileRef prof, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native CFDataRef ColorSyncProfileCopyHeader(
			ColorSyncProfileRef prof);

	@Generated
	@CFunction
	public static native void ColorSyncProfileSetHeader(
			ColorSyncMutableProfileRef prof, CFDataRef header);

	@Generated
	@CFunction
	public static native CFStringRef ColorSyncProfileCopyDescriptionString(
			ColorSyncProfileRef prof);

	@Generated
	@CFunction
	public static native CFArrayRef ColorSyncProfileCopyTagSignatures(
			ColorSyncProfileRef prof);

	@Generated
	@CFunction
	public static native boolean ColorSyncProfileContainsTag(
			ColorSyncProfileRef prof, CFStringRef signature);

	@Generated
	@CFunction
	public static native CFDataRef ColorSyncProfileCopyTag(
			ColorSyncProfileRef prof, CFStringRef signature);

	@Generated
	@CFunction
	public static native void ColorSyncProfileSetTag(
			ColorSyncMutableProfileRef prof, CFStringRef signature,
			CFDataRef data);

	@Generated
	@CFunction
	public static native void ColorSyncProfileRemoveTag(
			ColorSyncMutableProfileRef prof, CFStringRef signature);

	@Generated
	@CFunction
	public static native boolean ColorSyncProfileGetDisplayTransferFormulaFromVCGT(
			ColorSyncProfileRef profile, FloatPtr redMin, FloatPtr redMax,
			FloatPtr redGamma, FloatPtr greenMin, FloatPtr greenMax,
			FloatPtr greenGamma, FloatPtr blueMin, FloatPtr blueMax,
			FloatPtr blueGamma);

	@Generated
	@CFunction
	public static native CFDataRef ColorSyncProfileCreateDisplayTransferTablesFromVCGT(
			ColorSyncProfileRef profile, LongPtr nSamplesPerChannel);

	@Generated
	@CFunction
	public static native void ColorSyncIterateInstalledProfiles(
			@FunctionPtr(name = "call_ColorSyncIterateInstalledProfiles") Function_ColorSyncIterateInstalledProfiles callBack,
			IntPtr seed, VoidPtr userInfo, Ptr<CFErrorRef> error);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ColorSyncIterateInstalledProfiles {
		@Generated
		public boolean call_ColorSyncIterateInstalledProfiles(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native long ColorSyncTransformGetTypeID();

	@Generated
	@CFunction
	public static native ColorSyncTransformRef ColorSyncTransformCreate(
			CFArrayRef profileSequence, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native ConstVoidPtr ColorSyncTransformCopyProperty(
			ColorSyncTransformRef transform, ConstVoidPtr key,
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native void ColorSyncTransformSetProperty(
			ColorSyncTransformRef transform, ConstVoidPtr key,
			ConstVoidPtr property);

	@Generated
	@CFunction
	public static native boolean ColorSyncTransformConvert(
			ColorSyncTransformRef transform, long width, long height,
			VoidPtr dst, int dstDepth, int dstLayout, long dstBytesPerRow,
			ConstVoidPtr src, int srcDepth, int srcLayout, long srcBytesPerRow,
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native long ColorSyncCMMGetTypeID();

	@Generated
	@CFunction
	public static native ColorSyncCMMRef ColorSyncCMMCreate(
			CFBundleRef cmmBundle);

	@Generated
	@CFunction
	public static native CFBundleRef ColorSyncCMMGetBundle(ColorSyncCMMRef arg1);

	@Generated
	@CFunction
	public static native CFStringRef ColorSyncCMMCopyLocalizedName(
			ColorSyncCMMRef arg1);

	@Generated
	@CFunction
	public static native CFStringRef ColorSyncCMMCopyCMMIdentifier(
			ColorSyncCMMRef arg1);

	@Generated
	@CFunction
	public static native void ColorSyncIterateInstalledCMMs(
			@FunctionPtr(name = "call_ColorSyncIterateInstalledCMMs") Function_ColorSyncIterateInstalledCMMs callBack,
			VoidPtr userInfo);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ColorSyncIterateInstalledCMMs {
		@Generated
		public boolean call_ColorSyncIterateInstalledCMMs(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native boolean ColorSyncRegisterDevice(
			CFStringRef deviceClass, CFUUIDRef deviceID,
			CFDictionaryRef deviceInfo);

	@Generated
	@CFunction
	public static native boolean ColorSyncUnregisterDevice(
			CFStringRef deviceClass, CFUUIDRef deviceID);

	@Generated
	@CFunction
	public static native boolean ColorSyncDeviceSetCustomProfiles(
			CFStringRef deviceClass, CFUUIDRef deviceID,
			CFDictionaryRef profileInfo);

	@Generated
	@CFunction
	public static native CFDictionaryRef ColorSyncDeviceCopyDeviceInfo(
			CFStringRef deviceClass, CFUUIDRef devID);

	@Generated
	@CFunction
	public static native void ColorSyncIterateDeviceProfiles(
			@FunctionPtr(name = "call_ColorSyncIterateDeviceProfiles") Function_ColorSyncIterateDeviceProfiles callBack,
			VoidPtr userInfo);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ColorSyncIterateDeviceProfiles {
		@Generated
		public boolean call_ColorSyncIterateDeviceProfiles(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native CFUUIDRef CGDisplayCreateUUIDFromDisplayID(
			int displayID);

	@Generated
	@CFunction
	public static native int CGDisplayGetDisplayIDFromUUID(CFUUIDRef uuid);

	@Generated
	@Inline
	@CFunction
	public static native short InvokeCMFlattenUPP(
			int command,
			LongPtr size,
			VoidPtr data,
			VoidPtr refCon,
			@FunctionPtr(name = "call_InvokeCMFlattenUPP") Function_InvokeCMFlattenUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeCMFlattenUPP {
		@Generated
		public short call_InvokeCMFlattenUPP(int arg0, LongPtr arg1,
				VoidPtr arg2, VoidPtr arg3);
	}

	@Generated
	@Inline
	@CFunction
	public static native void DisposeCMFlattenUPP(
			@FunctionPtr(name = "call_DisposeCMFlattenUPP") Function_DisposeCMFlattenUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeCMFlattenUPP {
		@Generated
		public short call_DisposeCMFlattenUPP(int arg0, LongPtr arg1,
				VoidPtr arg2, VoidPtr arg3);
	}

	@Generated
	@Inline
	@CFunction
	public static native byte InvokeCMBitmapCallBackUPP(
			int progress,
			VoidPtr refCon,
			@FunctionPtr(name = "call_InvokeCMBitmapCallBackUPP") Function_InvokeCMBitmapCallBackUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeCMBitmapCallBackUPP {
		@Generated
		public byte call_InvokeCMBitmapCallBackUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native void DisposeCMBitmapCallBackUPP(
			@FunctionPtr(name = "call_DisposeCMBitmapCallBackUPP") Function_DisposeCMBitmapCallBackUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeCMBitmapCallBackUPP {
		@Generated
		public byte call_DisposeCMBitmapCallBackUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native byte InvokeCMConcatCallBackUPP(
			int progress,
			VoidPtr refCon,
			@FunctionPtr(name = "call_InvokeCMConcatCallBackUPP") Function_InvokeCMConcatCallBackUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeCMConcatCallBackUPP {
		@Generated
		public byte call_InvokeCMConcatCallBackUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native void DisposeCMConcatCallBackUPP(
			@FunctionPtr(name = "call_DisposeCMConcatCallBackUPP") Function_DisposeCMConcatCallBackUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeCMConcatCallBackUPP {
		@Generated
		public byte call_DisposeCMConcatCallBackUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native short InvokeCMProfileIterateUPP(
			VoidPtr iterateData,
			VoidPtr refCon,
			@FunctionPtr(name = "call_InvokeCMProfileIterateUPP") Function_InvokeCMProfileIterateUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeCMProfileIterateUPP {
		@Generated
		public short call_InvokeCMProfileIterateUPP(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native void DisposeCMProfileIterateUPP(
			@FunctionPtr(name = "call_DisposeCMProfileIterateUPP") Function_DisposeCMProfileIterateUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeCMProfileIterateUPP {
		@Generated
		public short call_DisposeCMProfileIterateUPP(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native short InvokeCMMIterateUPP(
			@UncertainArgument("Options: reference, array Fallback: reference") CMMInfo iterateData,
			VoidPtr refCon,
			@FunctionPtr(name = "call_InvokeCMMIterateUPP") Function_InvokeCMMIterateUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeCMMIterateUPP {
		@Generated
		public short call_InvokeCMMIterateUPP(
				@UncertainArgument("Options: reference, array Fallback: reference") CMMInfo arg0,
				VoidPtr arg1);
	}

	@Generated
	@Inline
	@CFunction
	public static native void DisposeCMMIterateUPP(
			@FunctionPtr(name = "call_DisposeCMMIterateUPP") Function_DisposeCMMIterateUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeCMMIterateUPP {
		@Generated
		public short call_DisposeCMMIterateUPP(
				@UncertainArgument("Options: reference, array Fallback: reference") CMMInfo arg0,
				VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void DisposeIconActionUPP(
			@FunctionPtr(name = "call_DisposeIconActionUPP") Function_DisposeIconActionUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeIconActionUPP {
		@Generated
		public short call_DisposeIconActionUPP(int arg0,
				Ptr<Ptr<BytePtr>> arg1, VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native void DisposeIconGetterUPP(
			@FunctionPtr(name = "call_DisposeIconGetterUPP") Function_DisposeIconGetterUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DisposeIconGetterUPP {
		@Generated
		@ReferenceInfo(type = Byte.class, depth = 2)
		public Ptr<BytePtr> call_DisposeIconGetterUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native short InvokeIconActionUPP(
			int theType,
			Ptr<Ptr<BytePtr>> theIcon,
			VoidPtr yourDataPtr,
			@FunctionPtr(name = "call_InvokeIconActionUPP") Function_InvokeIconActionUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeIconActionUPP {
		@Generated
		public short call_InvokeIconActionUPP(int arg0, Ptr<Ptr<BytePtr>> arg1,
				VoidPtr arg2);
	}

	@Generated
	@CFunction
	@ReferenceInfo(type = Byte.class, depth = 2)
	public static native Ptr<BytePtr> InvokeIconGetterUPP(
			int theType,
			VoidPtr yourDataPtr,
			@FunctionPtr(name = "call_InvokeIconGetterUPP") Function_InvokeIconGetterUPP userUPP);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_InvokeIconGetterUPP {
		@Generated
		@ReferenceInfo(type = Byte.class, depth = 2)
		public Ptr<BytePtr> call_InvokeIconGetterUPP(int arg0, VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native short IconRefToIconFamily(IconRef theIconRef,
			int whichIcons, Ptr<Ptr<Ptr<IconFamilyResource>>> iconFamily);

	@Generated
	@CFunction
	public static native short SetIconFamilyData(
			Ptr<Ptr<IconFamilyResource>> iconFamily, int iconType,
			Ptr<BytePtr> h);

	@Generated
	@CFunction
	public static native short GetIconFamilyData(
			Ptr<Ptr<IconFamilyResource>> iconFamily, int iconType,
			Ptr<BytePtr> h);

	@Generated
	@CFunction
	public static native byte IsIconRefMaskEmpty(IconRef iconRef);

	@Generated
	@CFunction
	public static native IconRef GetIconRefVariant(IconRef inIconRef,
			int inVariant, ShortPtr outTransform);

	@Generated
	@CFunction
	public static native byte AXAPIEnabled();

	@Generated
	@CFunction
	public static native byte AXIsProcessTrustedWithOptions(
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native byte AXIsProcessTrusted();

	@Generated
	@CFunction
	public static native int AXMakeProcessTrusted(CFStringRef executablePath);

	@Generated
	@CFunction
	public static native long AXUIElementGetTypeID();

	@Generated
	@CFunction
	public static native int AXUIElementCopyAttributeNames(
			AXUIElementRef element, Ptr<CFArrayRef> names);

	@Generated
	@CFunction
	public static native int AXUIElementCopyAttributeValue(
			AXUIElementRef element, CFStringRef attribute,
			Ptr<ConstVoidPtr> value);

	@Generated
	@CFunction
	public static native int AXUIElementGetAttributeValueCount(
			AXUIElementRef element, CFStringRef attribute, LongPtr count);

	@Generated
	@CFunction
	public static native int AXUIElementCopyAttributeValues(
			AXUIElementRef element, CFStringRef attribute, long index,
			long maxValues, Ptr<CFArrayRef> values);

	@Generated
	@CFunction
	public static native int AXUIElementIsAttributeSettable(
			AXUIElementRef element, CFStringRef attribute, BytePtr settable);

	@Generated
	@CFunction
	public static native int AXUIElementSetAttributeValue(
			AXUIElementRef element, CFStringRef attribute, ConstVoidPtr value);

	@Generated
	@CFunction
	public static native int AXUIElementCopyMultipleAttributeValues(
			AXUIElementRef element, CFArrayRef attributes, int options,
			Ptr<CFArrayRef> values);

	@Generated
	@CFunction
	public static native int AXUIElementCopyParameterizedAttributeNames(
			AXUIElementRef element, Ptr<CFArrayRef> names);

	@Generated
	@CFunction
	public static native int AXUIElementCopyParameterizedAttributeValue(
			AXUIElementRef element, CFStringRef parameterizedAttribute,
			ConstVoidPtr parameter, Ptr<ConstVoidPtr> result);

	@Generated
	@CFunction
	public static native int AXUIElementCopyActionNames(AXUIElementRef element,
			Ptr<CFArrayRef> names);

	@Generated
	@CFunction
	public static native int AXUIElementCopyActionDescription(
			AXUIElementRef element, CFStringRef action,
			Ptr<CFStringRef> description);

	@Generated
	@CFunction
	public static native int AXUIElementPerformAction(AXUIElementRef element,
			CFStringRef action);

	@Generated
	@CFunction
	public static native int AXUIElementCopyElementAtPosition(
			AXUIElementRef application, float x, float y,
			Ptr<AXUIElementRef> element);

	@Generated
	@CFunction
	public static native AXUIElementRef AXUIElementCreateApplication(int pid);

	@Generated
	@CFunction
	public static native AXUIElementRef AXUIElementCreateSystemWide();

	@Generated
	@CFunction
	public static native int AXUIElementGetPid(AXUIElementRef element,
			IntPtr pid);

	@Generated
	@CFunction
	public static native int AXUIElementSetMessagingTimeout(
			AXUIElementRef element, float timeoutInSeconds);

	@Generated
	@CFunction
	public static native int AXUIElementPostKeyboardEvent(
			AXUIElementRef application, char keyChar, short virtualKey,
			byte keyDown);

	@Generated
	@CFunction
	public static native long AXObserverGetTypeID();

	@Generated
	@CFunction
	public static native int AXObserverCreate(
			int application,
			@FunctionPtr(name = "call_AXObserverCreate") Function_AXObserverCreate callback,
			Ptr<AXObserverRef> outObserver);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_AXObserverCreate {
		@Generated
		public void call_AXObserverCreate(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2, VoidPtr arg3);
	}

	@Generated
	@CFunction
	public static native int AXObserverCreateWithInfoCallback(
			int application,
			@FunctionPtr(name = "call_AXObserverCreateWithInfoCallback") Function_AXObserverCreateWithInfoCallback callback,
			Ptr<AXObserverRef> outObserver);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_AXObserverCreateWithInfoCallback {
		@Generated
		public void call_AXObserverCreateWithInfoCallback(VoidPtr arg0,
				VoidPtr arg1, VoidPtr arg2, VoidPtr arg3, VoidPtr arg4);
	}

	@Generated
	@CFunction
	public static native int AXObserverAddNotification(AXObserverRef observer,
			AXUIElementRef element, CFStringRef notification, VoidPtr refcon);

	@Generated
	@CFunction
	public static native int AXObserverRemoveNotification(
			AXObserverRef observer, AXUIElementRef element,
			CFStringRef notification);

	@Generated
	@CFunction
	public static native CFRunLoopSourceRef AXObserverGetRunLoopSource(
			AXObserverRef observer);

	@Generated
	@CFunction
	public static native AXValueRef AXValueCreate(int theType,
			ConstVoidPtr valuePtr);

	@Generated
	@CFunction
	public static native int AXValueGetType(AXValueRef value);

	@Generated
	@CFunction
	public static native byte AXValueGetValue(AXValueRef value, int theType,
			VoidPtr valuePtr);

	@Generated
	@CFunction
	public static native int PMRetain(ConstVoidPtr object);

	@Generated
	@CFunction
	public static native int PMRelease(ConstVoidPtr object);

	@Generated
	@CFunction
	public static native int PMCreateSession(Ptr<PMPrintSession> printSession);

	@Generated
	@CFunction
	public static native int PMSessionError(PMPrintSession printSession);

	@Generated
	@CFunction
	public static native int PMSessionSetError(PMPrintSession printSession,
			int printError);

	@Generated
	@CFunction
	public static native int PMSessionEndDocumentNoDialog(
			PMPrintSession printSession);

	@Generated
	@CFunction
	public static native int PMSessionBeginPageNoDialog(
			PMPrintSession printSession,
			PMPageFormat pageFormat,
			@UncertainArgument("Options: reference, array Fallback: reference") PMRect pageFrame);

	@Generated
	@CFunction
	public static native int PMSessionEndPageNoDialog(
			PMPrintSession printSession);

	@Generated
	@CFunction
	public static native int PMSessionGetCurrentPrinter(
			PMPrintSession printSession, Ptr<PMPrinter> currentPrinter);

	@Generated
	@CFunction
	public static native int PMSessionGetDataFromSession(
			PMPrintSession printSession, CFStringRef key, Ptr<ConstVoidPtr> data);

	@Generated
	@CFunction
	public static native int PMSessionSetDataInSession(
			PMPrintSession printSession, CFStringRef key, ConstVoidPtr data);

	@Generated
	@CFunction
	public static native int PMCreatePageFormat(Ptr<PMPageFormat> pageFormat);

	@Generated
	@CFunction
	public static native int PMSessionDefaultPageFormat(
			PMPrintSession printSession, PMPageFormat pageFormat);

	@Generated
	@CFunction
	public static native int PMSessionValidatePageFormat(
			PMPrintSession printSession, PMPageFormat pageFormat, BytePtr result);

	@Generated
	@CFunction
	public static native int PMCopyPageFormat(PMPageFormat formatSrc,
			PMPageFormat formatDest);

	@Generated
	@CFunction
	public static native int PMGetAdjustedPageRect(
			PMPageFormat pageFormat,
			@UncertainArgument("Options: reference, array Fallback: reference") PMRect pageRect);

	@Generated
	@CFunction
	public static native int PMGetAdjustedPaperRect(
			PMPageFormat pageFormat,
			@UncertainArgument("Options: reference, array Fallback: reference") PMRect paperRect);

	@Generated
	@CFunction
	public static native int PMGetOrientation(PMPageFormat pageFormat,
			ShortPtr orientation);

	@Generated
	@CFunction
	public static native int PMGetPageFormatExtendedData(
			PMPageFormat pageFormat, int dataID, IntPtr size,
			VoidPtr extendedData);

	@Generated
	@CFunction
	public static native int PMGetScale(PMPageFormat pageFormat, DoublePtr scale);

	@Generated
	@CFunction
	public static native int PMGetUnadjustedPageRect(
			PMPageFormat pageFormat,
			@UncertainArgument("Options: reference, array Fallback: reference") PMRect pageRect);

	@Generated
	@CFunction
	public static native int PMGetUnadjustedPaperRect(
			PMPageFormat pageFormat,
			@UncertainArgument("Options: reference, array Fallback: reference") PMRect paperRect);

	@Generated
	@CFunction
	public static native int PMSetOrientation(PMPageFormat pageFormat,
			short orientation, byte lock);

	@Generated
	@CFunction
	public static native int PMSetPageFormatExtendedData(
			PMPageFormat pageFormat, int dataID, int size, VoidPtr extendedData);

	@Generated
	@CFunction
	public static native int PMSetScale(PMPageFormat pageFormat, double scale);

	@Generated
	@CFunction
	public static native int PMCreatePrintSettings(
			Ptr<PMPrintSettings> printSettings);

	@Generated
	@CFunction
	public static native int PMSessionDefaultPrintSettings(
			PMPrintSession printSession, PMPrintSettings printSettings);

	@Generated
	@CFunction
	public static native int PMSessionValidatePrintSettings(
			PMPrintSession printSession, PMPrintSettings printSettings,
			BytePtr result);

	@Generated
	@CFunction
	public static native int PMCopyPrintSettings(PMPrintSettings settingSrc,
			PMPrintSettings settingDest);

	@Generated
	@CFunction
	public static native int PMGetCopies(PMPrintSettings printSettings,
			IntPtr copies);

	@Generated
	@CFunction
	public static native int PMGetFirstPage(PMPrintSettings printSettings,
			IntPtr first);

	@Generated
	@CFunction
	public static native int PMGetLastPage(PMPrintSettings printSettings,
			IntPtr last);

	@Generated
	@CFunction
	public static native int PMGetPageRange(PMPrintSettings printSettings,
			IntPtr minPage, IntPtr maxPage);

	@Generated
	@CFunction
	public static native int PMSetCopies(PMPrintSettings printSettings,
			int copies, byte lock);

	@Generated
	@CFunction
	public static native int PMSetFirstPage(PMPrintSettings printSettings,
			int first, byte lock);

	@Generated
	@CFunction
	public static native int PMSetLastPage(PMPrintSettings printSettings,
			int last, byte lock);

	@Generated
	@CFunction
	public static native int PMSetPageRange(PMPrintSettings printSettings,
			int minPage, int maxPage);

	@Generated
	@CFunction
	public static native int PMPrinterGetDriverCreator(PMPrinter printer,
			IntPtr creator);

	@Generated
	@CFunction
	public static native int PMPrinterGetDriverReleaseInfo(
			PMPrinter printer,
			@UncertainArgument("Options: reference, array Fallback: reference") VersRec release);

	@Generated
	@CFunction
	public static native int PMPrinterGetPrinterResolutionCount(
			PMPrinter printer, IntPtr countP);

	@Generated
	@CFunction
	public static native int PMPrinterGetIndexedPrinterResolution(
			PMPrinter printer,
			int index,
			@UncertainArgument("Options: reference, array Fallback: reference") PMResolution resolutionP);

	@Generated
	@CFunction
	public static native int PMPrinterGetLanguageInfo(
			PMPrinter printer,
			@UncertainArgument("Options: reference, array Fallback: reference") PMLanguageInfo info);

	@Generated
	@CFunction
	@ByValue
	public static native NumVersion SpeechManagerVersion();

	@Generated
	@CFunction
	public static native short MakeVoiceSpec(
			int creator,
			int id,
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceSpec voice);

	@Generated
	@CFunction
	public static native short CountVoices(ShortPtr numVoices);

	@Generated
	@CFunction
	public static native short GetIndVoice(
			short index,
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceSpec voice);

	@Generated
	@CFunction
	public static native short GetVoiceDescription(
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceSpec voice,
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceDescription info,
			long infoLength);

	@Generated
	@CFunction
	public static native short GetVoiceInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceSpec voice,
			int selector, VoidPtr voiceInfo);

	@Generated
	@CFunction
	public static native short NewSpeechChannel(
			@UncertainArgument("Options: reference, array Fallback: reference") VoiceSpec voice,
			Ptr<Ptr<SpeechChannelRecord>> chan);

	@Generated
	@CFunction
	public static native short DisposeSpeechChannel(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan);

	@Generated
	@CFunction
	public static native short StopSpeech(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan);

	@Generated
	@CFunction
	public static native short StopSpeechAt(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			int whereToStop);

	@Generated
	@CFunction
	public static native short PauseSpeechAt(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			int whereToPause);

	@Generated
	@CFunction
	public static native short ContinueSpeech(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan);

	@Generated
	@CFunction
	public static native short SpeechBusy();

	@Generated
	@CFunction
	public static native short SpeechBusySystemWide();

	@Generated
	@CFunction
	public static native short SetSpeechRate(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			int rate);

	@Generated
	@CFunction
	public static native short GetSpeechRate(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			IntPtr rate);

	@Generated
	@CFunction
	public static native short SetSpeechPitch(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			int pitch);

	@Generated
	@CFunction
	public static native short GetSpeechPitch(
			@UncertainArgument("Options: reference, array Fallback: reference") SpeechChannelRecord chan,
			IntPtr pitch);

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericGrayProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericGrayGamma22Profile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericRGBProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericCMYKProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSRGBProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncAdobeRGB1998Profile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericLabProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncGenericXYZProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileHeader();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileColorSpace();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfilePCS();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileURL();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileMD5Digest();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigAToB0Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigAToB1Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigAToB2Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigBToA0Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigBToA1Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigBToA2Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigCmykData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigGrayData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigLabData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigRgbData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigXYZData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigAbstractClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigBlueTRCTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigBlueColorantTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigMediaBlackPointTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigCopyrightTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigProfileDescriptionTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigDeviceModelDescTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigDeviceMfgDescTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigGreenTRCTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigGreenColorantTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigGamutTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigGrayTRCTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigLinkClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigDisplayClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigNamedColor2Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigNamedColorClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigPreview0Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigPreview1Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigPreview2Tag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigOutputClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigProfileSequenceDescTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigRedTRCTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigRedColorantTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigInputClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigColorSpaceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigTechnologyTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigViewingConditionsTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigViewingCondDescTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncSigMediaWhitePointTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfile();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntent();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntentPerceptual();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntentRelative();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntentSaturation();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntentAbsolute();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncRenderingIntentUseProfileHeader();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformTag();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformDeviceToPCS();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformPCSToPCS();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformPCSToDevice();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformDeviceToDevice();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformGamutCheck();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncBlackPointCompensation();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncPreferredCMM();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConvertQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncBestQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncNormalQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDraftQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConvertThreadCount();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConvertUseVectorUnit();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTranformInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformCreator();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformSrcSpace();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformDstSpace();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformFullConversionData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformSimplifiedConversionData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncTransformParametricConversionData();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionMatrix();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionParamCurve0();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionParamCurve1();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionParamCurve2();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionParamCurve3();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionParamCurve4();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversion1DLut();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionGridPoints();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionChannelID();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversion3DLut();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionNDLut();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionInpChan();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionOutChan();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncConversionBPC();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncFixedPointRange();

	@Generated
	@CVariable()
	public static native CFStringRef kCMMInitializeLinkProfileProcName();

	@Generated
	@CVariable()
	public static native CFStringRef kCMMInitializeTransformProcName();

	@Generated
	@CVariable()
	public static native CFStringRef kCMMApplyTransformProcName();

	@Generated
	@CVariable()
	public static native CFStringRef kCMMCreateTransformPropertyProcName();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceID();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncCameraDeviceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDisplayDeviceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncPrinterDeviceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncScannerDeviceClass();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfileURL();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceDescriptions();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncFactoryProfiles();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncCustomProfiles();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceModeDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceModeDescriptions();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceDefaultProfileID();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceHostScope();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceUserScope();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileHostScope();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncProfileUserScope();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfileIsFactory();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfileIsDefault();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfileIsCurrent();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfileID();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceRegisteredNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceUnregisteredNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDeviceProfilesNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kColorSyncDisplayDeviceProfilesNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kAXTrustedCheckOptionPrompt();
}
