package org.anddev.andengine.util.spatial.adt.bounds.util;

import org.anddev.andengine.util.spatial.adt.bounds.IFloatBounds;


/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 23:12:02 - 07.10.2011
 */
public class FloatBoundsUtils {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	public static boolean intersects(final IFloatBounds pFloatBoundsA, final IFloatBounds pFloatBoundsB) {
		return FloatBoundsUtils.intersects(pFloatBoundsA.getXMin(), pFloatBoundsA.getYMin(), pFloatBoundsA.getXMax(), pFloatBoundsA.getYMax(), pFloatBoundsB.getXMin(), pFloatBoundsB.getYMin(), pFloatBoundsB.getXMax(), pFloatBoundsB.getYMax());
	}

	public static boolean intersects(final float pXMinA, final float pYMinA, final float pXMaxA, final float pYMaxA, final float pXMinB, final float pYMinB, final float pXMaxB, final float pYMaxB) {
		return (pXMinA < pXMaxB) && (pXMinB < pXMaxA) && (pYMinA < pYMaxB) && (pYMinB < pYMaxA);
	}

	public static boolean contains(final IFloatBounds pFloatBoundsA, final IFloatBounds pFloatBoundsB) {
		return FloatBoundsUtils.intersects(pFloatBoundsA.getXMin(), pFloatBoundsA.getYMin(), pFloatBoundsA.getXMax(), pFloatBoundsA.getYMax(), pFloatBoundsB.getXMin(), pFloatBoundsB.getYMin(), pFloatBoundsB.getXMax(), pFloatBoundsB.getYMax());
	}

	public static boolean contains(final float pXMinA, final float pYMinA, final float pXMaxA, final float pYMaxA, final float pXMinB, final float pYMinB, final float pXMaxB, final float pYMaxB) {
		return (pXMinA <= pXMinB) && (pYMinA <= pYMinB) && (pXMaxA >= pXMaxB) && (pYMaxA >= pYMaxB);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}