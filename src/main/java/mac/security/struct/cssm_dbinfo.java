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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_dbinfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_dbinfo() {
		super(cssm_dbinfo.class);
	}

	@Generated
	protected cssm_dbinfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int NumberOfRecordTypes();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNumberOfRecordTypes(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_db_parsing_module_info DefaultParsingModules();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDefaultParsingModules(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_parsing_module_info value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_db_record_attribute_info RecordAttributeNames();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRecordAttributeNames(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_info value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_db_record_index_info RecordIndexes();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRecordIndexes(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_index_info value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int IsLocal();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setIsLocal(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native BytePtr AccessPath();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAccessPath(BytePtr value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native VoidPtr Reserved();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setReserved(VoidPtr value);
}
