/**
 * @fileoverview added by tsickle
 * @suppress {checkTypes} checked by tsc
 */
import { Directive, EventEmitter, Input, Output } from '@angular/core';
import { MapService } from '../providers/mapService';
import { isNumber } from '../helpers/object';
var CanvasLayerComponent = /** @class */ (function () {
    function CanvasLayerComponent(_service) {
        this._service = _service;
        this.loaded = new EventEmitter();
    }
    /**
     * @return {?}
     */
    CanvasLayerComponent.prototype.ngOnInit = /**
     * @return {?}
     */
    function () {
        var _this = this;
        this._service
            .addOverlay(function (map) {
            _this.canvaslayer = new window.BMap.CanvasLayer(_this.getOptions(_this.options, map));
            return _this.canvaslayer;
        })
            .then(function () {
            _this.loaded.emit(_this.canvaslayer);
        });
    };
    /**
     * @return {?}
     */
    CanvasLayerComponent.prototype.ngOnDestroy = /**
     * @return {?}
     */
    function () {
        this._service.removeOverlay(this.canvaslayer);
    };
    /**
     * @param {?} options
     * @param {?} map
     * @return {?}
     */
    CanvasLayerComponent.prototype.getOptions = /**
     * @param {?} options
     * @param {?} map
     * @return {?}
     */
    function (options, map) {
        if (!options) {
            return;
        }
        var /** @type {?} */ opts = {};
        if (isNumber(options.zIndex)) {
            opts.zIndex = options.zIndex;
        }
        if (options.paneName) {
            opts.paneName = options.paneName;
        }
        if (options.update) {
            opts.update = function () {
                return options.update(map, this.canvas);
            };
        }
        return opts;
    };
    CanvasLayerComponent.decorators = [
        { type: Directive, args: [{
                    selector: 'canvaslayer'
                },] },
    ];
    /** @nocollapse */
    CanvasLayerComponent.ctorParameters = function () { return [
        { type: MapService, },
    ]; };
    CanvasLayerComponent.propDecorators = {
        "options": [{ type: Input },],
        "loaded": [{ type: Output },],
    };
    return CanvasLayerComponent;
}());
export { CanvasLayerComponent };
function CanvasLayerComponent_tsickle_Closure_declarations() {
    /** @type {!Array<{type: !Function, args: (undefined|!Array<?>)}>} */
    CanvasLayerComponent.decorators;
    /**
     * @nocollapse
     * @type {function(): !Array<(null|{type: ?, decorators: (undefined|!Array<{type: !Function, args: (undefined|!Array<?>)}>)})>}
     */
    CanvasLayerComponent.ctorParameters;
    /** @type {!Object<string,!Array<{type: !Function, args: (undefined|!Array<?>)}>>} */
    CanvasLayerComponent.propDecorators;
    /** @type {?} */
    CanvasLayerComponent.prototype.options;
    /** @type {?} */
    CanvasLayerComponent.prototype.loaded;
    /** @type {?} */
    CanvasLayerComponent.prototype.canvaslayer;
    /** @type {?} */
    CanvasLayerComponent.prototype._service;
}

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiY2FudmFzbGF5ZXIuY29tcG9uZW50LmpzIiwic291cmNlUm9vdCI6Im5nOi8vYW5ndWxhcjItYmFpZHUtbWFwLyIsInNvdXJjZXMiOlsiY29tcG9uZW50cy9jYW52YXNsYXllci5jb21wb25lbnQudHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7OztBQUFBLE9BQU8sRUFBRSxTQUFTLEVBQUUsWUFBWSxFQUFFLEtBQUssRUFBcUIsTUFBTSxFQUFFLE1BQU0sZUFBZSxDQUFBO0FBRXpGLE9BQU8sRUFBRSxVQUFVLEVBQUUsTUFBTSx5QkFBeUIsQ0FBQTtBQUVwRCxPQUFPLEVBQUUsUUFBUSxFQUFFLE1BQU0sbUJBQW1CLENBQUE7O0lBZTFDLDhCQUFvQixRQUFvQjtRQUFwQixhQUFRLEdBQVIsUUFBUSxDQUFZO3NCQUp2QixJQUFJLFlBQVksRUFBRTtLQUlTOzs7O0lBRXJDLHVDQUFROzs7OztRQUNiLElBQUksQ0FBQyxRQUFRO2FBQ1YsVUFBVSxDQUFDLFVBQUMsR0FBaUI7WUFDNUIsS0FBSSxDQUFDLFdBQVcsR0FBRyxJQUFJLE1BQU0sQ0FBQyxJQUFJLENBQUMsV0FBVyxDQUFDLEtBQUksQ0FBQyxVQUFVLENBQUMsS0FBSSxDQUFDLE9BQU8sRUFBRSxHQUFHLENBQUMsQ0FBQyxDQUFBO1lBQ2xGLE1BQU0sQ0FBQyxLQUFJLENBQUMsV0FBVyxDQUFBO1NBQ3hCLENBQUM7YUFDRCxJQUFJLENBQUM7WUFDSixLQUFJLENBQUMsTUFBTSxDQUFDLElBQUksQ0FBQyxLQUFJLENBQUMsV0FBVyxDQUFDLENBQUE7U0FDbkMsQ0FBQyxDQUFBOzs7OztJQUdDLDBDQUFXOzs7O1FBQ2hCLElBQUksQ0FBQyxRQUFRLENBQUMsYUFBYSxDQUFDLElBQUksQ0FBQyxXQUFXLENBQUMsQ0FBQTs7Ozs7OztJQUd2Qyx5Q0FBVTs7Ozs7Y0FBQyxPQUEyQixFQUFFLEdBQWlCO1FBQy9ELEVBQUUsQ0FBQyxDQUFDLENBQUMsT0FBTyxDQUFDLENBQUMsQ0FBQztZQUNiLE1BQU0sQ0FBQTtTQUNQO1FBQ0QscUJBQU0sSUFBSSxHQUF3QixFQUFFLENBQUE7UUFFcEMsRUFBRSxDQUFDLENBQUMsUUFBUSxDQUFDLE9BQU8sQ0FBQyxNQUFNLENBQUMsQ0FBQyxDQUFDLENBQUM7WUFDN0IsSUFBSSxDQUFDLE1BQU0sR0FBRyxPQUFPLENBQUMsTUFBTSxDQUFBO1NBQzdCO1FBQ0QsRUFBRSxDQUFDLENBQUMsT0FBTyxDQUFDLFFBQVEsQ0FBQyxDQUFDLENBQUM7WUFDckIsSUFBSSxDQUFDLFFBQVEsR0FBRyxPQUFPLENBQUMsUUFBUSxDQUFBO1NBQ2pDO1FBQ0QsRUFBRSxDQUFDLENBQUMsT0FBTyxDQUFDLE1BQU0sQ0FBQyxDQUFDLENBQUM7WUFDbkIsSUFBSSxDQUFDLE1BQU0sR0FBRztnQkFDWixNQUFNLENBQUMsT0FBTyxDQUFDLE1BQU0sQ0FBQyxHQUFHLEVBQUUsSUFBSSxDQUFDLE1BQU0sQ0FBQyxDQUFBO2FBQ3hDLENBQUE7U0FDRjtRQUVELE1BQU0sQ0FBQyxJQUFJLENBQUE7OztnQkEvQ2QsU0FBUyxTQUFDO29CQUNULFFBQVEsRUFBRSxhQUFhO2lCQUN4Qjs7OztnQkFQUSxVQUFVOzs7NEJBU2hCLEtBQUs7MkJBR0wsTUFBTTs7K0JBZFQ7O1NBVWEsb0JBQW9CIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgRGlyZWN0aXZlLCBFdmVudEVtaXR0ZXIsIElucHV0LCBPbkRlc3Ryb3ksIE9uSW5pdCwgT3V0cHV0IH0gZnJvbSAnQGFuZ3VsYXIvY29yZSdcblxuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgQkNhbnZhc0xheWVyLCBDYW52YXNMYXllck9wdGlvbnMsIEJDYW52YXNMYXllck9wdGlvbnMgfSBmcm9tICcuLi90eXBlcy9DYW52YXNMYXllcidcbmltcG9ydCB7IGlzTnVtYmVyIH0gZnJvbSAnLi4vaGVscGVycy9vYmplY3QnXG5pbXBvcnQgeyBCTWFwSW5zdGFuY2UgfSBmcm9tICcuLi90eXBlcy9NYXAnXG5cbkBEaXJlY3RpdmUoe1xuICBzZWxlY3RvcjogJ2NhbnZhc2xheWVyJ1xufSlcbmV4cG9ydCBjbGFzcyBDYW52YXNMYXllckNvbXBvbmVudCBpbXBsZW1lbnRzIE9uSW5pdCwgT25EZXN0cm95IHtcbiAgQElucHV0KClcbiAgcHJpdmF0ZSBvcHRpb25zOiBDYW52YXNMYXllck9wdGlvbnNcblxuICBAT3V0cHV0KClcbiAgcHJpdmF0ZSBsb2FkZWQgPSBuZXcgRXZlbnRFbWl0dGVyKClcblxuICBwcml2YXRlIGNhbnZhc2xheWVyOiBCQ2FudmFzTGF5ZXJcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIF9zZXJ2aWNlOiBNYXBTZXJ2aWNlKSB7fVxuXG4gIHB1YmxpYyBuZ09uSW5pdCgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuYWRkT3ZlcmxheSgobWFwOiBCTWFwSW5zdGFuY2UpID0+IHtcbiAgICAgICAgdGhpcy5jYW52YXNsYXllciA9IG5ldyB3aW5kb3cuQk1hcC5DYW52YXNMYXllcih0aGlzLmdldE9wdGlvbnModGhpcy5vcHRpb25zLCBtYXApKVxuICAgICAgICByZXR1cm4gdGhpcy5jYW52YXNsYXllclxuICAgICAgfSlcbiAgICAgIC50aGVuKCgpID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdCh0aGlzLmNhbnZhc2xheWVyKVxuICAgICAgfSlcbiAgfVxuXG4gIHB1YmxpYyBuZ09uRGVzdHJveSgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlLnJlbW92ZU92ZXJsYXkodGhpcy5jYW52YXNsYXllcilcbiAgfVxuXG4gIHByaXZhdGUgZ2V0T3B0aW9ucyhvcHRpb25zOiBDYW52YXNMYXllck9wdGlvbnMsIG1hcDogQk1hcEluc3RhbmNlKTogQkNhbnZhc0xheWVyT3B0aW9ucyB8IHVuZGVmaW5lZCB7XG4gICAgaWYgKCFvcHRpb25zKSB7XG4gICAgICByZXR1cm5cbiAgICB9XG4gICAgY29uc3Qgb3B0czogQkNhbnZhc0xheWVyT3B0aW9ucyA9IHt9XG5cbiAgICBpZiAoaXNOdW1iZXIob3B0aW9ucy56SW5kZXgpKSB7XG4gICAgICBvcHRzLnpJbmRleCA9IG9wdGlvbnMuekluZGV4XG4gICAgfVxuICAgIGlmIChvcHRpb25zLnBhbmVOYW1lKSB7XG4gICAgICBvcHRzLnBhbmVOYW1lID0gb3B0aW9ucy5wYW5lTmFtZVxuICAgIH1cbiAgICBpZiAob3B0aW9ucy51cGRhdGUpIHtcbiAgICAgIG9wdHMudXBkYXRlID0gZnVuY3Rpb24oKSB7XG4gICAgICAgIHJldHVybiBvcHRpb25zLnVwZGF0ZShtYXAsIHRoaXMuY2FudmFzKVxuICAgICAgfVxuICAgIH1cblxuICAgIHJldHVybiBvcHRzXG4gIH1cbn1cbiJdfQ==