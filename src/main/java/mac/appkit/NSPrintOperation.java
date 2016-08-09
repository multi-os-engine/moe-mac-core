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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSMutableData;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPrintOperation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPrintOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("EPSOperationWithView:insideRect:toData:")
	public static native NSPrintOperation EPSOperationWithViewInsideRectToData(
			NSView view, @ByValue CGRect rect, NSMutableData data);

	@Generated
	@Selector("EPSOperationWithView:insideRect:toData:printInfo:")
	public static native NSPrintOperation EPSOperationWithViewInsideRectToDataPrintInfo(
			NSView view, @ByValue CGRect rect, NSMutableData data,
			NSPrintInfo printInfo);

	@Generated
	@Selector("EPSOperationWithView:insideRect:toPath:printInfo:")
	public static native NSPrintOperation EPSOperationWithViewInsideRectToPathPrintInfo(
			NSView view, @ByValue CGRect rect, String path,
			NSPrintInfo printInfo);

	@Generated
	@Selector("PDFOperationWithView:insideRect:toData:")
	public static native NSPrintOperation PDFOperationWithViewInsideRectToData(
			NSView view, @ByValue CGRect rect, NSMutableData data);

	@Generated
	@Selector("PDFOperationWithView:insideRect:toData:printInfo:")
	public static native NSPrintOperation PDFOperationWithViewInsideRectToDataPrintInfo(
			NSView view, @ByValue CGRect rect, NSMutableData data,
			NSPrintInfo printInfo);

	@Generated
	@Selector("PDFOperationWithView:insideRect:toPath:printInfo:")
	public static native NSPrintOperation PDFOperationWithViewInsideRectToPathPrintInfo(
			NSView view, @ByValue CGRect rect, String path,
			NSPrintInfo printInfo);

	@Generated
	@Selector("PDFPanel")
	public native NSPDFPanel PDFPanel();

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPrintOperation alloc();

	@Generated
	@Selector("canSpawnSeparateThread")
	public native boolean canSpawnSeparateThread();

	@Generated
	@Selector("cleanUpOperation")
	public native void cleanUpOperation();

	@Generated
	@Selector("context")
	public native NSGraphicsContext context();

	@Generated
	@Selector("createContext")
	public native NSGraphicsContext createContext();

	@Generated
	@Selector("currentOperation")
	public static native NSPrintOperation currentOperation();

	@Generated
	@Selector("currentPage")
	public native long currentPage();

	@Generated
	@Selector("deliverResult")
	public native boolean deliverResult();

	@Generated
	@Selector("destroyContext")
	public native void destroyContext();

	@Generated
	@Selector("init")
	public native NSPrintOperation init();

	@Generated
	@Selector("isCopyingOperation")
	public native boolean isCopyingOperation();

	@Generated
	@Selector("jobStyleHint")
	public native String jobStyleHint();

	@Generated
	@Selector("jobTitle")
	public native String jobTitle();

	@Generated
	@Selector("pageOrder")
	public native long pageOrder();

	@Generated
	@Selector("pageRange")
	@ByValue
	public native NSRange pageRange();

	@Generated
	@Selector("preferredRenderingQuality")
	public native long preferredRenderingQuality();

	@Generated
	@Selector("printInfo")
	public native NSPrintInfo printInfo();

	@Generated
	@Selector("printOperationWithView:")
	public static native NSPrintOperation printOperationWithView(NSView view);

	@Generated
	@Selector("printOperationWithView:printInfo:")
	public static native NSPrintOperation printOperationWithViewPrintInfo(
			NSView view, NSPrintInfo printInfo);

	@Generated
	@Selector("printPanel")
	public native NSPrintPanel printPanel();

	@Generated
	@Selector("runOperation")
	public native boolean runOperation();

	@Generated
	@Selector("runOperationModalForWindow:delegate:didRunSelector:contextInfo:")
	public native void runOperationModalForWindowDelegateDidRunSelectorContextInfo(
			NSWindow docWindow,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didRunSelector, VoidPtr contextInfo);

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView view);

	@Generated
	@Selector("setCanSpawnSeparateThread:")
	public native void setCanSpawnSeparateThread(boolean canSpawnSeparateThread);

	@Generated
	@Selector("setCurrentOperation:")
	public static native void setCurrentOperation(NSPrintOperation operation);

	@Generated
	@Selector("setJobStyleHint:")
	public native void setJobStyleHint(String hint);

	@Generated
	@Selector("setJobTitle:")
	public native void setJobTitle(String jobTitle);

	@Generated
	@Selector("setPDFPanel:")
	public native void setPDFPanel(NSPDFPanel panel);

	@Generated
	@Selector("setPageOrder:")
	public native void setPageOrder(long pageOrder);

	@Generated
	@Selector("setPrintInfo:")
	public native void setPrintInfo(NSPrintInfo printInfo);

	@Generated
	@Selector("setPrintPanel:")
	public native void setPrintPanel(NSPrintPanel panel);

	@Generated
	@Selector("setShowPanels:")
	public native void setShowPanels(boolean flag);

	@Generated
	@Selector("setShowsPrintPanel:")
	public native void setShowsPrintPanel(boolean flag);

	@Generated
	@Selector("setShowsProgressPanel:")
	public native void setShowsProgressPanel(boolean flag);

	@Generated
	@Selector("showPanels")
	public native boolean showPanels();

	@Generated
	@Selector("showsPrintPanel")
	public native boolean showsPrintPanel();

	@Generated
	@Selector("showsProgressPanel")
	public native boolean showsProgressPanel();

	@Generated
	@Selector("view")
	public native NSView view();
}
