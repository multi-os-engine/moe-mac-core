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

package mac.coreservices.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.*;

@Generated
@Structure(alignment = 2)
public final class TECPluginDispatchTable extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TECPluginDispatchTable() {
		super(TECPluginDispatchTable.class);
	}

	@Generated
	protected TECPluginDispatchTable(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int compatibleVersion();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCompatibleVersion(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int PluginID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPluginID(int value);

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPluginNewEncodingConverter(
			@FunctionPtr(name = "call_PluginNewEncodingConverter") Function_PluginNewEncodingConverter value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginNewEncodingConverter {
		@Generated
		public int call_PluginNewEncodingConverter(Ptr<VoidPtr> arg0,
				VoidPtr arg1, int arg2, int arg3);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPluginClearContextInfo(
			@FunctionPtr(name = "call_PluginClearContextInfo") Function_PluginClearContextInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginClearContextInfo {
		@Generated
		public int call_PluginClearContextInfo(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPluginConvertTextEncoding(
			@FunctionPtr(name = "call_PluginConvertTextEncoding") Function_PluginConvertTextEncoding value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginConvertTextEncoding {
		@Generated
		public int call_PluginConvertTextEncoding(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPluginFlushConversion(
			@FunctionPtr(name = "call_PluginFlushConversion") Function_PluginFlushConversion value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginFlushConversion {
		@Generated
		public int call_PluginFlushConversion(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setPluginDisposeEncodingConverter(
			@FunctionPtr(name = "call_PluginDisposeEncodingConverter") Function_PluginDisposeEncodingConverter value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginDisposeEncodingConverter {
		@Generated
		public int call_PluginDisposeEncodingConverter(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPluginNewEncodingSniffer(
			@FunctionPtr(name = "call_PluginNewEncodingSniffer") Function_PluginNewEncodingSniffer value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginNewEncodingSniffer {
		@Generated
		public int call_PluginNewEncodingSniffer(Ptr<VoidPtr> arg0,
				VoidPtr arg1, int arg2);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPluginClearSnifferContextInfo(
			@FunctionPtr(name = "call_PluginClearSnifferContextInfo") Function_PluginClearSnifferContextInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginClearSnifferContextInfo {
		@Generated
		public int call_PluginClearSnifferContextInfo(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setPluginSniffTextEncoding(
			@FunctionPtr(name = "call_PluginSniffTextEncoding") Function_PluginSniffTextEncoding value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginSniffTextEncoding {
		@Generated
		public int call_PluginSniffTextEncoding(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setPluginDisposeEncodingSniffer(
			@FunctionPtr(name = "call_PluginDisposeEncodingSniffer") Function_PluginDisposeEncodingSniffer value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginDisposeEncodingSniffer {
		@Generated
		public int call_PluginDisposeEncodingSniffer(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setPluginGetCountAvailableTextEncodings(
			@FunctionPtr(name = "call_PluginGetCountAvailableTextEncodings") Function_PluginGetCountAvailableTextEncodings value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountAvailableTextEncodings {
		@Generated
		public int call_PluginGetCountAvailableTextEncodings(IntPtr arg0,
				long arg1, LongPtr arg2);
	}

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPluginGetCountAvailableTextEncodingPairs(
			@FunctionPtr(name = "call_PluginGetCountAvailableTextEncodingPairs") Function_PluginGetCountAvailableTextEncodingPairs value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountAvailableTextEncodingPairs {
		@Generated
		public int call_PluginGetCountAvailableTextEncodingPairs(
				@UncertainArgument("Options: reference, array Fallback: reference") TECConversionInfo arg0,
				long arg1, LongPtr arg2);
	}

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setPluginGetCountDestinationTextEncodings(
			@FunctionPtr(name = "call_PluginGetCountDestinationTextEncodings") Function_PluginGetCountDestinationTextEncodings value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountDestinationTextEncodings {
		@Generated
		public int call_PluginGetCountDestinationTextEncodings(int arg0,
				IntPtr arg1, long arg2, LongPtr arg3);
	}

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setPluginGetCountSubTextEncodings(
			@FunctionPtr(name = "call_PluginGetCountSubTextEncodings") Function_PluginGetCountSubTextEncodings value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountSubTextEncodings {
		@Generated
		public int call_PluginGetCountSubTextEncodings(int arg0, IntPtr arg1,
				long arg2, LongPtr arg3);
	}

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setPluginGetCountAvailableSniffers(
			@FunctionPtr(name = "call_PluginGetCountAvailableSniffers") Function_PluginGetCountAvailableSniffers value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountAvailableSniffers {
		@Generated
		public int call_PluginGetCountAvailableSniffers(IntPtr arg0, long arg1,
				LongPtr arg2);
	}

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setPluginGetCountWebTextEncodings(
			@FunctionPtr(name = "call_PluginGetCountWebTextEncodings") Function_PluginGetCountWebTextEncodings value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountWebTextEncodings {
		@Generated
		public int call_PluginGetCountWebTextEncodings(IntPtr arg0, long arg1,
				LongPtr arg2);
	}

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setPluginGetCountMailTextEncodings(
			@FunctionPtr(name = "call_PluginGetCountMailTextEncodings") Function_PluginGetCountMailTextEncodings value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetCountMailTextEncodings {
		@Generated
		public int call_PluginGetCountMailTextEncodings(IntPtr arg0, long arg1,
				LongPtr arg2);
	}

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setPluginGetTextEncodingInternetName(
			@FunctionPtr(name = "call_PluginGetTextEncodingInternetName") Function_PluginGetTextEncodingInternetName value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetTextEncodingInternetName {
		@Generated
		public int call_PluginGetTextEncodingInternetName(int arg0, BytePtr arg1);
	}

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setPluginGetTextEncodingFromInternetName(
			@FunctionPtr(name = "call_PluginGetTextEncodingFromInternetName") Function_PluginGetTextEncodingFromInternetName value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PluginGetTextEncodingFromInternetName {
		@Generated
		public int call_PluginGetTextEncodingFromInternetName(
				IntPtr arg0,
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);
	}
}
