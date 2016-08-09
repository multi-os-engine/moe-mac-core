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

package mac.coretext.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class sfntVariationHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sfntVariationHeader() {
		super(sfntVariationHeader.class);
	}

	@Generated
	protected sfntVariationHeader(Pointer peer) {
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
	public native short offsetToData();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOffsetToData(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short countSizePairs();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCountSizePairs(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short axisCount();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAxisCount(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short axisSize();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAxisSize(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short instanceCount();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setInstanceCount(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short instanceSize();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setInstanceSize(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native sfntVariationAxis axis();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setAxis(@ByValue sfntVariationAxis value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native sfntInstance instance();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setInstance(@ByValue sfntInstance value);
}
