/* @file MagErrors.java
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

class MagErrors
{
  double DeclErr;
  double InclErr;
  double FErr;

  MagErrors( )
  {
    DeclErr = 0;
    InclErr = 0;
    FErr    = 0;
  }

  MagErrors( double d, double i, double f )
  {
    DeclErr = d;
    InclErr = i;
    FErr    = f;
  }
}
