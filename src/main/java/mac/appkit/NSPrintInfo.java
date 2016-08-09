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
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSCoder;
import mac.foundation.NSDictionary;
import mac.foundation.NSMutableDictionary;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPrintInfo extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPrintInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("PMPageFormat")
	public native VoidPtr PMPageFormat();

	@Generated
	@Selector("PMPrintSession")
	public native VoidPtr PMPrintSession();

	@Generated
	@Selector("PMPrintSettings")
	public native VoidPtr PMPrintSettings();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPrintInfo alloc();

	@Generated
	@Selector("bottomMargin")
	public native double bottomMargin();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("defaultPrinter")
	public static native NSPrinter defaultPrinter();

	@Generated
	@Selector("dictionary")
	public native NSMutableDictionary dictionary();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("horizontalPagination")
	public native long horizontalPagination();

	@Generated
	@Selector("imageablePageBounds")
	@ByValue
	public native CGRect imageablePageBounds();

	@Generated
	@Selector("init")
	public native NSPrintInfo init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDictionary:")
	public native NSPrintInfo initWithDictionary(NSDictionary attributes);

	@Generated
	@Selector("isHorizontallyCentered")
	public native boolean isHorizontallyCentered();

	@Generated
	@Selector("isSelectionOnly")
	public native boolean isSelectionOnly();

	@Generated
	@Selector("isVerticallyCentered")
	public native boolean isVerticallyCentered();

	@Generated
	@Selector("jobDisposition")
	public native String jobDisposition();

	@Generated
	@Selector("leftMargin")
	public native double leftMargin();

	@Generated
	@Selector("localizedPaperName")
	public native String localizedPaperName();

	@Generated
	@Selector("orientation")
	public native long orientation();

	@Generated
	@Selector("paperName")
	public native String paperName();

	@Generated
	@Selector("paperSize")
	@ByValue
	public native CGSize paperSize();

	@Generated
	@Selector("printSettings")
	public native NSMutableDictionary printSettings();

	@Generated
	@Selector("printer")
	public native NSPrinter printer();

	@Generated
	@Selector("rightMargin")
	public native double rightMargin();

	@Generated
	@Selector("scalingFactor")
	public native double scalingFactor();

	@Generated
	@Selector("setBottomMargin:")
	public native void setBottomMargin(double margin);

	@Generated
	@Selector("setDefaultPrinter:")
	public static native void setDefaultPrinter(NSPrinter printer);

	@Generated
	@Selector("setHorizontalPagination:")
	public native void setHorizontalPagination(long mode);

	@Generated
	@Selector("setHorizontallyCentered:")
	public native void setHorizontallyCentered(boolean flag);

	@Generated
	@Selector("setJobDisposition:")
	public native void setJobDisposition(String disposition);

	@Generated
	@Selector("setLeftMargin:")
	public native void setLeftMargin(double margin);

	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(long orientation);

	@Generated
	@Selector("setPaperName:")
	public native void setPaperName(String name);

	@Generated
	@Selector("setPaperSize:")
	public native void setPaperSize(@ByValue CGSize size);

	@Generated
	@Selector("setPrinter:")
	public native void setPrinter(NSPrinter printer);

	@Generated
	@Selector("setRightMargin:")
	public native void setRightMargin(double margin);

	@Generated
	@Selector("setScalingFactor:")
	public native void setScalingFactor(double scalingFactor);

	@Generated
	@Selector("setSelectionOnly:")
	public native void setSelectionOnly(boolean selectionOnly);

	@Generated
	@Selector("setSharedPrintInfo:")
	public static native void setSharedPrintInfo(NSPrintInfo printInfo);

	@Generated
	@Selector("setTopMargin:")
	public native void setTopMargin(double margin);

	@Generated
	@Selector("setUpPrintOperationDefaultValues")
	public native void setUpPrintOperationDefaultValues();

	@Generated
	@Selector("setVerticalPagination:")
	public native void setVerticalPagination(long mode);

	@Generated
	@Selector("setVerticallyCentered:")
	public native void setVerticallyCentered(boolean flag);

	@Generated
	@Selector("sharedPrintInfo")
	public static native NSPrintInfo sharedPrintInfo();

	@Generated
	@Selector("sizeForPaperName:")
	@ByValue
	public static native CGSize sizeForPaperName(String name);

	@Generated
	@Selector("takeSettingsFromPDFInfo:")
	public native void takeSettingsFromPDFInfo(NSPDFInfo inPDFInfo);

	@Generated
	@Selector("topMargin")
	public native double topMargin();

	@Generated
	@Selector("updateFromPMPageFormat")
	public native void updateFromPMPageFormat();

	@Generated
	@Selector("updateFromPMPrintSettings")
	public native void updateFromPMPrintSettings();

	@Generated
	@Selector("verticalPagination")
	public native long verticalPagination();
}
