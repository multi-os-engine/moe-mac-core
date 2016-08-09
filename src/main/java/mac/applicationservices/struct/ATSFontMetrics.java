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

package mac.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class ATSFontMetrics extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSFontMetrics() {
		super(ATSFontMetrics.class);
	}

	@Generated
	protected ATSFontMetrics(Pointer peer) {
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
	public native double ascent();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAscent(double value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native double descent();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDescent(double value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native double leading();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLeading(double value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native double avgAdvanceWidth();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAvgAdvanceWidth(double value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native double maxAdvanceWidth();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMaxAdvanceWidth(double value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native double minLeftSideBearing();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMinLeftSideBearing(double value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native double minRightSideBearing();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setMinRightSideBearing(double value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native double stemWidth();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setStemWidth(double value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native double stemHeight();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setStemHeight(double value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native double capHeight();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setCapHeight(double value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native double xHeight();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setXHeight(double value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native double italicAngle();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setItalicAngle(double value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native double underlinePosition();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setUnderlinePosition(double value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native double underlineThickness();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setUnderlineThickness(double value);
}
