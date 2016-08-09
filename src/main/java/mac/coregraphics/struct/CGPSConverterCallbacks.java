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

package mac.coregraphics.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CGPSConverterCallbacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CGPSConverterCallbacks() {
		super(CGPSConverterCallbacks.class);
	}

	@Generated
	protected CGPSConverterCallbacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setBeginDocument(
			@FunctionPtr(name = "call_beginDocument") Function_beginDocument value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_beginDocument {
		@Generated
		public void call_beginDocument(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEndDocument(
			@FunctionPtr(name = "call_endDocument") Function_endDocument value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_endDocument {
		@Generated
		public void call_endDocument(VoidPtr arg0, boolean arg1);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setBeginPage(
			@FunctionPtr(name = "call_beginPage") Function_beginPage value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_beginPage {
		@Generated
		public void call_beginPage(VoidPtr arg0, long arg1, VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setEndPage(
			@FunctionPtr(name = "call_endPage") Function_endPage value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_endPage {
		@Generated
		public void call_endPage(VoidPtr arg0, long arg1, VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNoteProgress(
			@FunctionPtr(name = "call_noteProgress") Function_noteProgress value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_noteProgress {
		@Generated
		public void call_noteProgress(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setNoteMessage(
			@FunctionPtr(name = "call_noteMessage") Function_noteMessage value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_noteMessage {
		@Generated
		public void call_noteMessage(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setReleaseInfo(
			@FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_releaseInfo {
		@Generated
		public void call_releaseInfo(VoidPtr arg0);
	}
}
