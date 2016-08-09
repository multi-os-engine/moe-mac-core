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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import mac.struct.Point;

@Generated
@Structure(alignment = 2)
public final class FInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FInfo() {
		super(FInfo.class);
	}

	@Generated
	protected FInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int fdType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFdType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int fdCreator();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFdCreator(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short fdFlags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFdFlags(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native Point fdLocation();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFdLocation(@ByValue Point value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short fdFldr();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFdFldr(short value);
}
