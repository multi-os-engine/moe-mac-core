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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class KerxCoordinateAction extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public KerxCoordinateAction() {
		super(KerxCoordinateAction.class);
	}

	@Generated
	protected KerxCoordinateAction(Pointer peer) {
		super(peer);
	}

	@Generated
	public KerxCoordinateAction(short markX, short markY, short currX,
			short currY) {
		super(KerxCoordinateAction.class);
		setMarkX(markX);
		setMarkY(markY);
		setCurrX(currX);
		setCurrY(currY);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short markX();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMarkX(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short markY();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMarkY(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short currX();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCurrX(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short currY();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCurrY(short value);
}
