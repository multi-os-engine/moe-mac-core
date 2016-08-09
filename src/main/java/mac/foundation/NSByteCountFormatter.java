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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSByteCountFormatter extends NSFormatter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSByteCountFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSByteCountFormatter alloc();

	@Generated
	@Selector("allowedUnits")
	public native long allowedUnits();

	@Generated
	@Selector("allowsNonnumericFormatting")
	public native boolean allowsNonnumericFormatting();

	@Generated
	@Selector("countStyle")
	public native long countStyle();

	@Generated
	@Selector("includesActualByteCount")
	public native boolean includesActualByteCount();

	@Generated
	@Selector("includesCount")
	public native boolean includesCount();

	@Generated
	@Selector("includesUnit")
	public native boolean includesUnit();

	@Generated
	@Selector("init")
	public native NSByteCountFormatter init();

	@Generated
	@Selector("isAdaptive")
	public native boolean isAdaptive();

	@Generated
	@Selector("setAdaptive:")
	public native void setAdaptive(boolean value);

	@Generated
	@Selector("setAllowedUnits:")
	public native void setAllowedUnits(long value);

	@Generated
	@Selector("setAllowsNonnumericFormatting:")
	public native void setAllowsNonnumericFormatting(boolean value);

	@Generated
	@Selector("setCountStyle:")
	public native void setCountStyle(long value);

	@Generated
	@Selector("setIncludesActualByteCount:")
	public native void setIncludesActualByteCount(boolean value);

	@Generated
	@Selector("setIncludesCount:")
	public native void setIncludesCount(boolean value);

	@Generated
	@Selector("setIncludesUnit:")
	public native void setIncludesUnit(boolean value);

	@Generated
	@Selector("setZeroPadsFractionDigits:")
	public native void setZeroPadsFractionDigits(boolean value);

	@Generated
	@Selector("stringFromByteCount:")
	public native String stringFromByteCount(long byteCount);

	@Generated
	@Selector("stringFromByteCount:countStyle:")
	public static native String stringFromByteCountCountStyle(long byteCount,
			long countStyle);

	@Generated
	@Selector("zeroPadsFractionDigits")
	public native boolean zeroPadsFractionDigits();
}
