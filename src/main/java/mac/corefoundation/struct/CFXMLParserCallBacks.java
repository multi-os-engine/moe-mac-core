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

package mac.corefoundation.struct;


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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CFXMLParserCallBacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFXMLParserCallBacks() {
		super(CFXMLParserCallBacks.class);
	}

	@Generated
	protected CFXMLParserCallBacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(long value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCreateXMLStructure(
			@FunctionPtr(name = "call_createXMLStructure") Function_createXMLStructure value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_createXMLStructure {
		@Generated
		public VoidPtr call_createXMLStructure(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAddChild(
			@FunctionPtr(name = "call_addChild") Function_addChild value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_addChild {
		@Generated
		public void call_addChild(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2,
				VoidPtr arg3);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setEndXMLStructure(
			@FunctionPtr(name = "call_endXMLStructure") Function_endXMLStructure value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_endXMLStructure {
		@Generated
		public void call_endXMLStructure(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setResolveExternalEntity(
			@FunctionPtr(name = "call_resolveExternalEntity") Function_resolveExternalEntity value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_resolveExternalEntity {
		@Generated
		public VoidPtr call_resolveExternalEntity(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CFXMLExternalID arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setHandleError(
			@FunctionPtr(name = "call_handleError") Function_handleError value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_handleError {
		@Generated
		public byte call_handleError(VoidPtr arg0, long arg1, VoidPtr arg2);
	}
}
