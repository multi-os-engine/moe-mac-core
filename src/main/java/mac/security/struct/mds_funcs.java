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


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.*;

@Generated
@Structure()
public final class mds_funcs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mds_funcs() {
		super(mds_funcs.class);
	}

	@Generated
	protected mds_funcs(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDbOpen(
			@FunctionPtr(name = "call_DbOpen") Function_DbOpen value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DbOpen {
		@Generated
		public int call_DbOpen(
				long arg0,
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_net_address arg2,
				int arg3, VoidPtr arg4, ConstVoidPtr arg5, LongPtr arg6);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDbClose(
			@FunctionPtr(name = "call_DbClose") Function_DbClose value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DbClose {
		@Generated
		public int call_DbClose(@ByValue cssm_dl_db_handle arg0);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGetDbNames(
			@FunctionPtr(name = "call_GetDbNames") Function_GetDbNames value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_GetDbNames {
		@Generated
		public int call_GetDbNames(long arg0, Ptr<Ptr<cssm_name_list>> arg1);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setGetDbNameFromHandle(
			@FunctionPtr(name = "call_GetDbNameFromHandle") Function_GetDbNameFromHandle value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_GetDbNameFromHandle {
		@Generated
		public int call_GetDbNameFromHandle(@ByValue cssm_dl_db_handle arg0,
				Ptr<BytePtr> arg1);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFreeNameList(
			@FunctionPtr(name = "call_FreeNameList") Function_FreeNameList value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FreeNameList {
		@Generated
		public int call_FreeNameList(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_name_list arg1);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDataInsert(
			@FunctionPtr(name = "call_DataInsert") Function_DataInsert value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataInsert {
		@Generated
		public int call_DataInsert(
				@ByValue cssm_dl_db_handle arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				Ptr<VoidPtr> arg4);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDataDelete(
			@FunctionPtr(name = "call_DataDelete") Function_DataDelete value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataDelete {
		@Generated
		public int call_DataDelete(@ByValue cssm_dl_db_handle arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setDataModify(
			@FunctionPtr(name = "call_DataModify") Function_DataModify value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataModify {
		@Generated
		public int call_DataModify(
				@ByValue cssm_dl_db_handle arg0,
				int arg1,
				VoidPtr arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_data arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4,
				int arg5);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setDataGetFirst(
			@FunctionPtr(name = "call_DataGetFirst") Function_DataGetFirst value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataGetFirst {
		@Generated
		public int call_DataGetFirst(
				@ByValue cssm_dl_db_handle arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_query arg1,
				LongPtr arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_data arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4,
				Ptr<VoidPtr> arg5);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setDataGetNext(
			@FunctionPtr(name = "call_DataGetNext") Function_DataGetNext value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataGetNext {
		@Generated
		public int call_DataGetNext(
				@ByValue cssm_dl_db_handle arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				Ptr<VoidPtr> arg4);
	}

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDataAbortQuery(
			@FunctionPtr(name = "call_DataAbortQuery") Function_DataAbortQuery value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataAbortQuery {
		@Generated
		public int call_DataAbortQuery(@ByValue cssm_dl_db_handle arg0,
				long arg1);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDataGetFromUniqueRecordId(
			@FunctionPtr(name = "call_DataGetFromUniqueRecordId") Function_DataGetFromUniqueRecordId value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DataGetFromUniqueRecordId {
		@Generated
		public int call_DataGetFromUniqueRecordId(
				@ByValue cssm_dl_db_handle arg0,
				VoidPtr arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_record_attribute_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3);
	}

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setFreeUniqueRecord(
			@FunctionPtr(name = "call_FreeUniqueRecord") Function_FreeUniqueRecord value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FreeUniqueRecord {
		@Generated
		public int call_FreeUniqueRecord(@ByValue cssm_dl_db_handle arg0,
				VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setCreateRelation(
			@FunctionPtr(name = "call_CreateRelation") Function_CreateRelation value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CreateRelation {
		@Generated
		public int call_CreateRelation(
				@ByValue cssm_dl_db_handle arg0,
				int arg1,
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
				int arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_schema_attribute_info arg4,
				int arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_db_schema_index_info arg6);
	}

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setDestroyRelation(
			@FunctionPtr(name = "call_DestroyRelation") Function_DestroyRelation value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DestroyRelation {
		@Generated
		public int call_DestroyRelation(@ByValue cssm_dl_db_handle arg0,
				int arg1);
	}
}
