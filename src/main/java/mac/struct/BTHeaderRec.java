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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class BTHeaderRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public BTHeaderRec() {
		super(BTHeaderRec.class);
	}

	@Generated
	protected BTHeaderRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short treeDepth();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTreeDepth(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int rootNode();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRootNode(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int leafRecords();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLeafRecords(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int firstLeafNode();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFirstLeafNode(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int lastLeafNode();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setLastLeafNode(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short nodeSize();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNodeSize(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short maxKeyLength();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMaxKeyLength(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int totalNodes();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setTotalNodes(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int freeNodes();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFreeNodes(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short reserved1();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setReserved1(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int clumpSize();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setClumpSize(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte btreeType();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setBtreeType(byte value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native byte keyCompareType();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setKeyCompareType(byte value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int attributes();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setAttributes(int value);

	@Generated
	@StructureField(order = 14, isGetter = true, count = 16)
	public native int reserved3(int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = false, count = 16)
	public native void setReserved3(int value, int field_idx);
}
