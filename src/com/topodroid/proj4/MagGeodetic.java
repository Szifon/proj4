/* @file MagGeodetic.java
 *
 * @author marco corvi
 * @date jan 2017
 *
 * @brief Proj4 World Magnetic Model (copied from TopoDroid)
 * --------------------------------------------------------
 *  Copyright This sowftare is distributed under GPL-3.0 or later
 *  See the file COPYING.
 * --------------------------------------------------------
 * Implemented after GeomagneticLibrary.c by
 *  National Geophysical Data Center
 *  NOAA EGC/2
 *  325 Broadway
 *  Boulder, CO 80303 USA
 *  Attn: Susan McLean
 *  Phone:  (303) 497-6478
 *  Email:  Susan.McLean@noaa.gov
 */
package com.topodroid.proj4;

// MAGtype_CoordGeodetic;
class MagGeodetic
{
  double lambda; /* longitude */
  double phi; /* geodetic latitude */
  double HeightAboveEllipsoid; /* height above the ellipsoid (HaE) */
  double HeightAboveGeoid; /* (height above the EGM96 geoid model ) */
  boolean UseGeoid;

  MagGeodetic()
  {
    UseGeoid = MagUtil.MAG_USE_GEOID;
  }

  MagGeodetic( MagGeodetic geodetic )  // copy cstr
  {
    phi    = geodetic.phi;
    lambda = geodetic.lambda;
    HeightAboveEllipsoid = geodetic.HeightAboveEllipsoid;
    HeightAboveGeoid = geodetic.HeightAboveGeoid;
    UseGeoid = geodetic.UseGeoid;
  }
}
