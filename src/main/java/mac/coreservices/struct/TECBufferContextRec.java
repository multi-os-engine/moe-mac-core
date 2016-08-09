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


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure(alignment = 2)
public final class TECBufferContextRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TECBufferContextRec() {
		super(TECBufferContextRec.class);
	}

	@Generated
	protected TECBufferContextRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String textInputBuffer();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTextInputBuffer(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String textInputBufferEnd();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTextInputBufferEnd(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native BytePtr textOutputBuffer();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTextOutputBuffer(BytePtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native BytePtr textOutputBufferEnd();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTextOutputBufferEnd(BytePtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native TextEncodingRun encodingInputBuffer();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setEncodingInputBuffer(
			@UncertainArgument("Options: reference, array Fallback: reference") TextEncodingRun value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native TextEncodingRun encodingInputBufferEnd();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setEncodingInputBufferEnd(
			@UncertainArgument("Options: reference, array Fallback: reference") TextEncodingRun value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native TextEncodingRun encodingOutputBuffer();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setEncodingOutputBuffer(
			@UncertainArgument("Options: reference, array Fallback: reference") TextEncodingRun value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native TextEncodingRun encodingOutputBufferEnd();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setEncodingOutputBufferEnd(
			@UncertainArgument("Options: reference, array Fallback: reference") TextEncodingRun value);
}
