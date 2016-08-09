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

@Generated
@Structure()
public final class cssm_db_schema_index_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_db_schema_index_info() {
		super(cssm_db_schema_index_info.class);
	}

	@Generated
	protected cssm_db_schema_index_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_db_schema_index_info(int AttributeId, int IndexId,
			int IndexType, int IndexedDataLocation) {
		super(cssm_db_schema_index_info.class);
		setAttributeId(AttributeId);
		setIndexId(IndexId);
		setIndexType(IndexType);
		setIndexedDataLocation(IndexedDataLocation);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int AttributeId();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAttributeId(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int IndexId();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setIndexId(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int IndexType();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIndexType(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int IndexedDataLocation();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIndexedDataLocation(int value);
}
